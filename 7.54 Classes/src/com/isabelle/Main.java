/*
 * isabelle andre
 * 04/07/18
 * class introduction
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " +porsche.getModel());
    }
}
