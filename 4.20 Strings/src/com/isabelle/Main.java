package com.isabelle;

public class Main {

    public static void main(String[] args) {
        /*
         *primitive data types:
         *byte
         *short
         * int
         *long
         * float
         * double
         * char
         * boolean
         */

        String sString = "This is a string";
        System.out.println("My String is equal to " +sString);
        sString = sString + ", and this is more. ";
        System.out.println("My String is equal to " +sString);
        sString = sString + "\u00A9 2015";
        System.out.println("My String is equal to " +sString);

        String sNumberString = "250.55";
        sNumberString = sNumberString + "49.95";
        System.out.println("The result is " +sNumberString);

        String sLastString = "10";
        int nInt = 50;
        sLastString = sLastString + nInt;
        System.out.println("Last String is equal to " +sLastString);


    }
}
