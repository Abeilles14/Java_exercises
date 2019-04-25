/*
 * isabelle andre
 * 25/07/18
 * oop challenge
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic",  "White","Sausage", 3.56);
        double price = hamburger.itemizedHamburger();
        hamburger.addition1("Tomato", 0.27);
        hamburger.addition2("Lettuce", 0.75);
        hamburger.addition3("Cheese", 1.13);
        System.out.println("Total Burger price is " +hamburger.itemizedHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.healthyAddition1("Egg", 5.43);
        healthyBurger.itemizedHamburger();
        healthyBurger.healthyAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " +healthyBurger.itemizedHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizedHamburger();
    }
}
