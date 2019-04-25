/*
 * car class extends vehicle, chages gear, velocity
 * constructor loads 2 strings 3 int, 1 boolean
 */

package com.isabelle;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear (int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car current gear changed to " +currentGear);
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car Vehicle is moving at " +speed +" at " +direction + " degrees");
        move(speed, direction);
    }



}
