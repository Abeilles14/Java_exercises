/*
 * isabelle andre
 * 01/08/18
 * autoboxing and unboxing
 */

package com.isabelle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();     //cant add primitive type int (has to be class)
        strArrayList.add("Tim");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        Integer IntValue = 56;                               //gets converted into Integer.valueOf(56)
        int myInt = IntValue.intValue();

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++){
            intArrayList.add(Integer.valueOf(i));                       //wraps int in Integer (autoboxing)
        }

        for(int i=0; i<=10; i++){
            System.out.println(i + " --> "+ intArrayList.get(i).intValue());   //converts back to int (unboxing)
        }

        ArrayList<Double> doubleValues = new ArrayList<Double>();
        for(double db =0.0; db<=10.0; db +=0.5){
            doubleValues.add(Double.valueOf(db));
        }

        for(int i=0; i<doubleValues.size(); i++){
            double value = doubleValues.get(i).doubleValue();
            System.out.println(i+ " --> "+value);
        }

    }
}

class IntClass {                    //use wrapper instead
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}