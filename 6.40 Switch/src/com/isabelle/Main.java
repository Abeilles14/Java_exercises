/*
 *isabelle andre
 * 14/06/18
 * Switch statements
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {

        /*
        int value = 1;
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        */

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3, 4, or 5");
                break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }

        //CHALLENGE

        char character = 'A';
        switch (character) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Character is D");
                break;
            case 'E':
                System.out.println("Character is E");
                break;
            default:
                System.out.println("Character not found");
                break;
        }

        String month = "JANUARY";
        switch(month.toLowerCase()){        //class converts string to lowercase
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Jan or Jun");
                break;
        }
    }
}
