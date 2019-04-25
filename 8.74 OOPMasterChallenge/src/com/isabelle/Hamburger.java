/*
 * Hamburger class
 */
package com.isabelle;

public class Hamburger {
    private String name;
    private String roll;
    private String meat;
    private double price;
    private String add1;
    private double price1;
    private String add2;
    private double price2;
    private String add3;
    private double price3;
    private String add4;
    private double price4;

    public Hamburger(String name, String roll, String meat, double price){
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void addition1(String name, double price){
        this.add1 = name;
        this.price1 += price;
    }
    public void addition2(String name, double price){
        this.add2 = name;
        this.price2 += price;
    }
    public void addition3(String name, double price){
        this.add3 = name;
        this.price3 += price;
    }
    public void addition4(String name, double price){
        this.add4 = name;
        this.price4 += price;
    }

    public double itemizedHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.roll + " roll price is " +this.price);
        if(this.add1 != null){
            hamburgerPrice += this.price1;
            System.out.println("Added " +this.add1 + " for an extra " +this.price1);
        }
        if(this.add2 != null){
            hamburgerPrice += this.price2;
            System.out.println("Added " +this.add2 + " for an extra " +this.price2);
        }
        if(this.add3 != null){
            hamburgerPrice += this.price3;
            System.out.println("Added " +this.add3 + " for an extra " +this.price3);
        }
        if(this.add4 != null){
            hamburgerPrice += this.price4;
            System.out.println("Added " +this.add4 + " for an extra " +this.price4);
        }

        return hamburgerPrice;
    }
}

