/*
 * isabelle andre
 * 12/6/18
 * Floating point numbers/nubmers with decimals
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int nValue = 5/3;
        //width of float = 32 (4 bytes)
	    float fValue = 5f/3f;
	    //width of double = 64 (8 bytes)
	    double dValue = 5d/3d;
        System.out.println("My Int Value = " +nValue);
        System.out.println("My Float Value = " +fValue);
        System.out.println("My Double Value = " +dValue);
    }
}
