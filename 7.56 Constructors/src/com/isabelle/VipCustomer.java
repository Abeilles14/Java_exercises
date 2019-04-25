/*
 * vip customer class
 * constructer 1 empty
 *
 */
package com.isabelle;

public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    public VipCustomer(){
        this("Izzy", 5000, "omegasky@");
    }

    public VipCustomer(String name, double limit){
        this(name, limit, "isa14@hot");
    }
    public VipCustomer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public double getLimit(){
        return this.limit;
    }
    public String getEmail(){
        return this.email;
    }
}
