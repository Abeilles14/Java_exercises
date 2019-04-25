/*
 * isabelle andre
 * 27/07/18
 * array challenge: populate array with inputted ints, print array, rearrange array from highest to lowest
 */

package com.isabelle;

import java.util.Scanner;
import java.util.Collections;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arInput = getIntegers(5);
        int[] arSorted = sortIntegers(arInput);

        printArray(arInput);

        for(int i=0; i< arInput.length; i++){
            System.out.println("Sorted Number " +i+ " is " +arSorted[i]);
        }


    }

    public static int[] getIntegers(int capacity) {
        int[] arInput = new int[capacity];
        System.out.println("Enter " +capacity +" integers:\r");
        for (int i=0; i<capacity; i++){
            arInput[i] = scanner.nextInt();
        }
        return arInput;
    }

    public static void printArray (int[] arInput){
        for (int i=0; i<arInput.length; i++){
            System.out.println("Number " +i+ " is " + arInput[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray){
        int[] intSorted = new int[intArray.length];
        boolean sorted = false;
        int temp;
        for (int i = 0; i < intArray.length; i++) {     //populates intSorted
            intSorted[i] = intArray[i];
        }
        while(!sorted){
            sorted = true;
            for (int i=0; i<intSorted.length-1; i++){
                if (intSorted[i] < intSorted[i+1]){
                    temp = intSorted[i];
                    intSorted[i] = intSorted[i+1];
                    intSorted[i+1] = temp;
                    sorted = false;
                }
            }
        }





        return intSorted;
    }




/* reverses array...
    public static int[] sortIntegers(int[] intArray){
        int[] arSorted = new int[intArray.length];
        int counter = 0;
        for(int j=intArray.length-1; j>=0; j--){
                arSorted[counter] = intArray[j];
                counter++;
        }
        return arSorted;
    }       */


}
