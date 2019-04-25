/*
 * isabelle andre
 * 16/06/18
 * finds sum of digits in a number
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the number's digits is " +sumDigits(125));
    }

    public static int sumDigits (int number) {
        int digit;
        int sum = 0;
        if (number < 10) {
            return -1;
        }

        do {
            digit = number % 10;                //extracts least sig digit
            sum += digit;
            number /= 10;          //discards least sig digit
        } while (number > 0);
        return sum;
    }
}
