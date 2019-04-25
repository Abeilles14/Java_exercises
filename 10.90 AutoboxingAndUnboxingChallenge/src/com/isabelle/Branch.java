/*
 * can add customer with initial transaction amount, add more transactions for that customer
 */
package com.isabelle;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customersList;

    public Branch(String name){
        this.name = name;
        this.customersList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public void printCustomersList(){
        System.out.println("Printing customer list");
        for(int i=0; i<customersList.size(); i++){
            System.out.println(customersList.get(i).getName());
        }
    }

    public void addCustomer(String name, double iniTransaction){
        if(findCustomer(name) != null){
            System.out.println("Customer already exists");
        } else {
            Customer newCustomer = new Customer(name, iniTransaction);
            this.customersList.add(newCustomer);
            System.out.println("Customer added");
        }
    }

    public void addCustomerTransaction(String name, double transaction){
        if(findCustomer(name) != null){
            System.out.println("Customer already exists");
        } else {
            for(int i=0; i<customersList.size(); i++){
                if(customersList.get(i).getName().equals(name)){
                    customersList.get(i).addTransaction(transaction);
                }
            }
        }
    }

    private Customer findCustomer(String name){
        for(int i=0; i<this.customersList.size(); i++){
            if(this.customersList.get(i).getName().equals(name)){
                return customersList.get(i);
            }
        }
        return null;
    }
}
