/*
 * class dog extends animal, inherits characteristics
 * constructor 1 loads 2 strings, 6 int: name, size, weight, eyes, legs, tail, teeth, coat
 */

package com.isabelle;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);        //calls Animal constructor
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog is chewing");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog is walking");
        super.move(5);                      //calls super class move
    }

    public void run(){
        System.out.println("Dog is running");
        move(10);                           //calls this class move override
    }

    private void moveLegs (int speed) {
        System.out.println("Dog is moving legs");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog is moving");
        moveLegs(speed);
        super.move(speed);
    }
}
