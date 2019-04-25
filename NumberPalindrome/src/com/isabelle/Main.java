/*
 * isabelle andre
 * 21/06/18
 * checks if number is a palindrome
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        if (palindrome(-21012)) {
            System.out.println("Number is a Palindrome");
        } else {
            System.out.println("Number is not a Palindrome");
        }
    }

    public static boolean palindrome (int number) {
        int lastDigit;
        int reverse = 0;

        if (number < 0) {
            number *= -1;
        }
        int newNumber = number;

        while (newNumber > 0) {
            lastDigit = newNumber % 10;
            reverse = reverse * 10 + lastDigit;
            newNumber /= 10;
        }

        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
