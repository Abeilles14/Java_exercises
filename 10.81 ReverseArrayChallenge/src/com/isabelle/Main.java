/*
 * isabelle andre
 * 28/07/18
 * reverses arrays
 */
package com.isabelle;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arOrder = new int[] {1,2,3,4,5};
        System.out.println("The array in order is:" +Arrays.toString(arOrder));
        reverse(arOrder);
    }

    public static void reverse (int[] intArray){      //reverse arrays
        int[] arReverse = new int[intArray.length];
        int counter = 0;
        for(int j=intArray.length-1; j>=0; j--){
            arReverse[counter] = intArray[j];
            counter++;
        }
        System.out.println("The array in reverse is: " +Arrays.toString(arReverse));
    }
}
