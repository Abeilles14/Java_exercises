/*
 * vehicle class
 * constructor 1 loads 2 Strings: name, size
 */

package com.isabelle;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle is steering at " +currentDirection +" degrees");
    }

    public void move (int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle is moving at " +currentVelocity +" at " +currentDirection + " degrees");
    }

    public void stop (){
        this.currentVelocity = 0;
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}


