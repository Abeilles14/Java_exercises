/*
 * healthy burger class
 */
package com.isabelle;

class HealthyBurger extends Hamburger{
    private String healthyAdd1;
    private double healthyPrice1;
    private String healthyAdd2;
    private double healthyPrice2;

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", "Brown Rye", meat, price);
    }

    public void healthyAddition1(String name, double price){
        this.healthyAdd1 = name;
        this.healthyPrice1 += price;
    }
    public void healthyAddition2(String name, double price){
        this.healthyAdd2 = name;
        this.healthyPrice2 += price;
    }

    @Override
    public double itemizedHamburger() {
        double hamburgerPrice = super.itemizedHamburger();
        if(this.healthyAdd1 != null) {
            hamburgerPrice += this.healthyPrice1;
            System.out.println("Added " +this.healthyAdd1 + " for an extra " + this.healthyPrice1);
        }
        if(this.healthyAdd1 != null) {
            hamburgerPrice += this.healthyPrice1;
            System.out.println("Added " +this.healthyAdd1 + " for an extra " + this.healthyPrice1);
        }
        return hamburgerPrice;
    }
}
