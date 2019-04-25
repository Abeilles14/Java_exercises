/*
 *isabelle andre
 *14/06/18
 *switch statement identifies day of week
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(4);
    }

    public static void printDayOfTheWeek (int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

}
