/*
 * isabelle andre
 * 04/07/18
 * finds minimum and maximum number input, exits if invalid
 */
package com.isabelle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int number;
        int min = 0;        // = 2147483647, = Integer.MAX_VALUE
        int max = 0;        // = -2147483648, = Integer.MAX_VALUE
        boolean first = true;
	    boolean isAnInt;

	    while (true) {
            System.out.println("Enter number: ");
            isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                number = scanner.nextInt();

                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }

                if (min > number) {
                    min = number;
                } else if (max < number) {
                    max = number;
                }

            } else {
                break;
            }

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The minimum is " +min +" and the maximum is " +max);
    }
}
