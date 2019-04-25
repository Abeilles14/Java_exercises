/*
 * isabelle andre
 * 03/07/18
 * uses scanner to read user input, hasNextInt, nextLine and close
 */

package com.isabelle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();          //check if input is int

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();        //yearOfBirth = inputed number
            scanner.nextLine();                         //handle next line character/enter key

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
