/*
 * isabelle andre
 * 04/07/18
 * reads user inputed numbers and prints sum
 */
package com.isabelle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean isAnInt;
        int sum = 0;
        int counter = 1;

        while (counter <= 10) {
            System.out.println("Enter number #" +counter +": ");
            isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The sum is " +sum);
        scanner.close();
    }
}
