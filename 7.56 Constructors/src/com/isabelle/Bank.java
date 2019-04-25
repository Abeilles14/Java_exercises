/*
 * bank account class creates bank account for customer, withdraws and deposit
 * constructor 1 empty with default values
 * constructor 2 loads account number, balance, name, email, phone number
 * constructor 3 loads name, email, phone number
 */
package com.isabelle;

public class Bank {
    private int accNum;
    private double balance;
    private String name;
    private String email;
    private int phoneNum;

    public Bank() {                                         //constructor
        this(56789, 2.50, "Default name", "Default address", 8970853);                     //default parameters if called without
        System.out.println("Empty constructor called");
    }

    public Bank(int accNum, double balance, String name, String email, int phoneNum) {
        this.accNum = accNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public Bank(String name, String email, int phoneNum) {
        this(123123,100.55,name, email, phoneNum);
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAccNum() {
        return this.accNum;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public int getPhoneNum() {
        return this.phoneNum;
    }

    public void deposit (double money) {
        this.balance += money;
        System.out.println("New balance is: " +this.balance);
    }

    public void withdraw (double money) {
        if (this.balance - money < 0) {
            System.out.println("Unable to withdraw");
        } else {
            this.balance -= money;
            System.out.println("New balance is: " +this.balance);
        }
    }

}
