/*
 * isabelle andre
 * 15/06/18
 * prints numbers dividable by 3 and 5 and finds sum
 */


package com.isabelle;

public class Main {

    public static void main(String[] args) {
        int counter =0;
        int sum = 0;
	    for (int i = 1; i<=1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i +" can be divided by 3 and 5");
                sum += i;
                counter ++;
            }
            if (counter ==5) {
                break;
            }
        }
        System.out.println("The sum of the numbers is " +sum);
    }
}
