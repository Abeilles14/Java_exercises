/*
 * isabelle andre
 * 28/06/18
 * finds largest prime factor of a number
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(5));
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime (int number) {
        int largestprime = 0;
        boolean prime = false;

        if (number < 0) {
            return -1;
        }

        for (int i = 2; i <= number; i++) {       //finds factors
            if (number % i == 0) {

                for (int j = 2; j <= i; j++) {     //checks if factor is prime
                    if (i % j == 0 && i != j) {
                        prime = false;
                        break;
                    } else {
                        prime = true;
                    }
                }

                if (!prime) {
                    continue;
                }

                largestprime = i;
            }
        }

        if (largestprime <= 1) {
            return -1;
        } else {
            return largestprime;
        }
    }

}
