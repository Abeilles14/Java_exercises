
/*
 * animal class basic animal characteristics
 * constructor 1 loads 4 int: brain, body, size, weight
 */
package com.isabelle;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " +speed);
    }

    public String getName(){
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
