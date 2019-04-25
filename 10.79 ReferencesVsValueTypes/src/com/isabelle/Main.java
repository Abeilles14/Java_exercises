/*
 * isabelle andre
 * 28/07/18
 * references and value types
 */

package com.isabelle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	     int intValue = 10;
	     int intValue2 = intValue;
	     intValue2++;                                       //value type work independently
        System.out.println("intValue = " +intValue);
        System.out.println("intValue2 = " +intValue2);

        int[] intArray = new int[5];                        //reference type
        int[] intArray2 = intArray;                         //hold same address

        intArray2[0] = 1;

        System.out.println("intArray = " +Arrays.toString(intArray));   //converts array to string
        System.out.println("intArray2 = " +Arrays.toString(intArray));

        //intArray2 = new int[]{4,5,6,7,8};                       //new reference
        modArray(intArray);

        System.out.println("intArray = " +Arrays.toString(intArray));   //converts array to string
        System.out.println("intArray2 = " +Arrays.toString(intArray));
    }

    private static void modArray(int[] array){
        array[0] = 2;
        array = new int[]{1,2,3,4,5};               //new different array
    }
}
