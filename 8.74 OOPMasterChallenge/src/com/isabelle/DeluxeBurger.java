/*
 * deluxe burger class
 */
package com.isabelle;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 14.54);
        super.addition1("Chips", 2.75);
        super.addition2("Drink", 1.81);
    }

    @Override
    public void addition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

