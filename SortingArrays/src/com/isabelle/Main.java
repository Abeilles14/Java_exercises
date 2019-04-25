/*
 * isabelle andre
 * 27/07/18
 * sorting arrays from highest to lowest, reversing arrays
 */

package com.isabelle;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arInput = getIntegers(5);
        int[] arSorted = sortIntegers(arInput);
        int[] arReversed = reverseArray(arSorted);

        printArray(arInput);

        for(int i=0; i< arInput.length; i++){
            System.out.println("Sorted Number " +i+ " is " +arSorted[i]);
        }

        for(int i=0; i< arInput.length; i++){
            System.out.println("Reversed Number " +i+ " is " +arReversed[i]);
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

    public static int[] sortIntegers(int[] intArray){       //sorts arrays
        int[] intSorted = new int[intArray.length];
        boolean sorted = false;
        int temp;
        for (int i = 0; i < intArray.length; i++) {     //populates intSorted
            intSorted[i] = intArray[i];
        }
        while(!sorted){
            sorted = true;
            for (int i=0; i<intSorted.length-1; i++){   //avoid being out of range
                if (intSorted[i] < intSorted[i+1]){
                    temp = intSorted[i];                //temp number to compare
                    intSorted[i] = intSorted[i+1];      //swap the 2 numbers
                    intSorted[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return intSorted;
    }

    public static int[] reverseArray (int[] intArray){      //reverse arrays
        int[] arReverse = new int[intArray.length];
        int counter = 0;
        for(int j=intArray.length-1; j>=0; j--){
                arReverse[counter] = intArray[j];
                counter++;
        }
        return arReverse;
    }


}