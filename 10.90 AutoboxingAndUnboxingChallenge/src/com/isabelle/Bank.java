/*
 * add new branch, add customer to branch with initial transaction
 * add transaction to existing customer, show list of customers from branch, and list of their transaction
 */
package com.isabelle;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesList;

    public Bank(String name){
        this.name = name;
        this.branchesList = new ArrayList<Branch>();
    }

    public void addBranch(String name){
        if (findBranch(name)>0){
            System.out.println("Branch already exists");
        } else {
            Branch branch = new Branch(name);
            this.branchesList.add(branch);
            System.out.println("Branch added");
        }
    }

    public void addCustomer(String customerName, String branchName, double iniTransaction){
        if(findBranch(branchName)<0) {
            System.out.println("Branch does not exist");
        } else {
            for(int i=0; i<branchesList.size(); i++){
                branchesList.get(i).addCustomer(customerName, iniTransaction);
            }
        }
    }

    public void addTransaction(String customerName, String branchName, double transaction){
        if(findBranch(branchName)<0){
            System.out.println("Branch does not exist");
        } else {
            for (int i=0; i<branchesList.size(); i++){
                branchesList.get(i).addCustomerTransaction(customerName, transaction);
            }
        }
    }

    public void printBranchTransactions(String branchName){
        ArrayList<Customer> customersList;
        if (findBranch(branchName)<0){
            System.out.println("Branch does not exist");
        } else {
            System.out.println("Printing branch customers name and transactions");
            for (int i=0; i<branchesList.size(); i++){
                if (branchesList.get(i).getName().equals(branchName)){
                    branchesList.get(i).printCustomersList();
                    customersList = branchesList.get(i).getCustomersList();
                        for(int j=0; j<customersList.size(); j++){
                            customersList.get(j).printTransations();
                        }
                }
            }
        }
    }

    private int findBranch(String name){
        for (int i=0; i<branchesList.size(); i++){
            if(branchesList.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
