/*
 * customer class, Customer has an arraylist of doubles(transactions)
 */
package com.isabelle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsList;

    public Customer(String name, double transaction){
        this.name = name;
        this.transactionsList = new ArrayList<Double>();
        addTransaction(transaction);
    }

    public void printTransations(){
        System.out.println("Printing transactions");
        for(int i=0; i<transactionsList.size(); i++){
            System.out.println(transactionsList.get(i));
        }
    }

    public void addTransaction(double amount){
        this.transactionsList.add(amount);
        System.out.println("Transaction added");
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionsList() {
        return transactionsList;
    }
}
