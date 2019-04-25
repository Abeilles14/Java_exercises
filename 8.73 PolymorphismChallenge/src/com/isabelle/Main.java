/*
 * isabelle andre
 * 25/07/18
 * polymorphism challenge, child class overrides parent class, uses parent methods
 */

package com.isabelle;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("Starting engine");
    }

    public void accelerate(){
        System.out.println("Car accelerated");
    }

    public void brake(){
        System.out.println("Car stopped");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Honda extends Car{
    public Honda(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class Volkswagen extends Car{
    public Volkswagen(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class Lexus extends Car{
    public Lexus(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Lexus lexus = new Lexus("Lexus 2018", 4);
        car.startEngine();
        car.accelerate();
        car.brake();

        Honda honda = new Honda("Honda 2016", 3);
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
