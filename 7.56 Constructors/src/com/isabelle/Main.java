/*
 * isabelle andre
 * 04/07/18
 * constructors challenge
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
	    //Bank account = new Bank ();
	    Bank account = new Bank (12345, 0.00, "Izzy", "isa@hot", 8973493);
        Bank acc = new Bank ("Isabelle", "isa14@hot", 12345);
        System.out.println(acc.getAccNum() + "name" + acc.getName());

        VipCustomer isabelle = new VipCustomer();
        VipCustomer andre = new VipCustomer("Tim", 1500);
        System.out.println("Customer name is " +isabelle.getName());
        System.out.println("Andre's email is " +andre.getEmail());

        /*
	    account.setAccNum(5191);                                    //setters if constructor doesnt initialize all fields
	    account.setBalance(7500.49);
	    account.setName("Isabelle Andre");
	    account.setEmail("isabelle.andre14@hotmail.com");
	    account.setPhoneNum(8970853);
	    */

	    account.getBalance();
	    account.deposit(499.50);
	    account.withdraw(269.39);
	    account.withdraw(8000);
    }
}
