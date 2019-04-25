/*
 * isabelle andre
 * 26/06/18
 * parse string into int or double
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " +numberAsString);

        int number = Integer.parseInt(numberAsString);          //wrapper class
        System.out.println("number = " +number);

        numberAsString += 1;                                //string
        number += 1;                                        //int

        System.out.println("numberAsString = " +numberAsString);
        System.out.println("number = " +number);
    }
}
