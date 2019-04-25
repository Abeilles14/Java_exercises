/*
 * isabelle andre
 * 01/08/18
 * autoboxing and unboxing challenge
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("BMO");

        bank.addBranch("King St");
        bank.addCustomer("Isabelle", "King St", 50.05);
        bank.addCustomer("Tim", "King St", 20.45);

        bank.addBranch("Weber St");
        bank.addCustomer("Sydney", "Weber St", 150.54);

        bank.addTransaction("Isabelle", "King St", 44.22);
        bank.addTransaction("Tim", "King St", 12.44);

        bank.printBranchTransactions("King St");
        bank.printBranchTransactions("Weber St");
    }
}
