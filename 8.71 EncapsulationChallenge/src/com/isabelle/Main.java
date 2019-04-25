/*
 * isabelle andre
 * 24/07/18
 * encapsulation challenge
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,false);
        System.out.println("Initial page coutn = " +printer.getPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPages());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPages());

    }
}
