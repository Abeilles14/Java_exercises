/*
 * isabelle andre
 * 27/07/18
 * arrays
 */
package com.isabelle;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    /*
        int[] myIntArr = new int[25];
	    //myIntArr[0] = 45;
	    //myIntArr[5] = 50;

        for(int i=0; i<25; i++){
            myIntArr[i] = i*10;
        }

        printArr(myIntArr);


	    for(int i=0; i<myIntArr.length; i++){
            System.out.println("Element " + i + " value is " + myIntArr[i]);
        }
        */

        int[]  myInts = getIntegers(5);
        for(int i=0; i<myInts.length; i++){
            System.out.println("Element " + i +" typed value was " +myInts[i]);
        }
        System.out.println("The average is " + getAverage(myInts));
    }

    public static int[] getIntegers(int number) {           //stores 5 inputted values in array
        System.out.println("Enter " + number + " integer values\r");    //switch line
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[]array){        //finds average
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }

    /*
    public static void printArr(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }
    */

}
