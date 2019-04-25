/*
 * isabelle andre
 * 06/08/18
 * linked lists, talk about indexes and addresses, each item in list holds link to item that follows it, and value it stores
 */

package com.isabelle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Isabelle", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer;             //not a separate class, pointing to first one
	    anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " +customer.getBalance());       //points to first class

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++){
            System.out.println(i +": " +intList.get(i));
        }
        intList.add(1,2);                       //index at 1 has been shifted down

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " +intList.get(i));
        }
    }
}
