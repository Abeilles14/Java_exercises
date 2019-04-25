/*
 *isabelle andre
 * 14/06/18
 * For loops calculates and prints 10,000 at 2-8% interest rates, calculates prime numbers in for loop
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
       // System.out.println("10,000 at 2% interest = " +calculateInterest(10000.0, 2.0));

        for (int i=2; i<9; i++) {
            System.out.println("10,000 at 2% interest = " +String.format("%.2f",calculateInterest(10000.0, i)));    //formats to 2 dec
        }

        System.out.println("****");

        for (int i=8; i>1; i--) {
            System.out.println("10,000 at 2% interest = " +String.format("%.2f",calculateInterest(10000.0, i)));    //formats to 2 dec
        }



        //CHALLENGE

        int counter = 0;
        for (int i = 1; i <=20; i++){
            if (isPrime(i)){
                System.out.println(i +" is prime");
                counter ++;
                System.out.println(counter +" prime number(s) found");
                if (counter == 3) {
                    break;
                }
            }
        }


    }

    public static double calculateInterest (double amount, double interestRate) {
        return(amount *(interestRate/100));
    }

    //CHALLENGE

    public static boolean  isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        }

        for (int i =2; i <= n/2; i++) {         //OR (int i =2; i <= Math.sqrt(n); i++) bc eliminates extra looping
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
