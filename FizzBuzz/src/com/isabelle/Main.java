/*
 * isabelle andre
 * 21/06/18
 * FizzBuzz exercise, print numbers 1-100, multiple 3 = Fizz, multiple 5 = Buzz, Multiple 3 & 5 = FizzBuzz
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i <= 100; i++) {
	        if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
