/*
 * isabelle andre
 * 28/07/18
 * stores input in array, finds minimum
 */
package com.isabelle;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] arInt = readIntegers(count);
        System.out.println("The minimum is " +findMin(arInt));

    }

    public static int[] readIntegers(int count){
        int[] arInput = new int[count];
        System.out.println("Enter " + count +" integers:\r");
        for (int i=0; i<count; i++){
            arInput[i] = scanner.nextInt();
        }
        return arInput;
    }

    public static int findMin(int[] arInput){
        int min = arInput[0];
        //int min = Integer.MAX_VALUE;
        for (int i=0; i<arInput.length; i++){
            if(min > arInput[i]){
                min = arInput[i];
            }
        }
        return min;
    }
}

