/*
  *isabelle andre
  *12/6/18
  *int, byte, short, and long min and max values, prints int and byte min value divided by 2
 */

package com.company;


public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int nMinValue = -2_147_483_648;
        int nMaxValue = 2_147_483_647;
        int nTotal = (nMinValue/2);
        System.out.println(nTotal);


        //byte has a width of 8
        byte bMinValue = -128;
        byte bMaxValue = 127;
        byte bTotal = (byte)(bMinValue/2);
        System.out.println(bTotal);

        //short has a width of 16
        short sMinValue = -32768;
        short sMaxValue = -32767;

        //long has a width of 64
        long lMinValue = -9_223_372_036_854_775_808L;
        long lMaxValue = 9_223_372_036_854_775_807L;

    }
}
