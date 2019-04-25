/*
 * isabelle andre
 * 29/07/18
 * array list challenge
 */
package com.isabelle;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone samsung = new MobilePhone("Isabelle", "5198970853");

    public static void main(String[] args) {
        int choice;
        boolean quit = false;


        //setUp();

        printInstructions();

        while(!quit){
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    samsung.printList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    printContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = new Contact(name, phone);
        //Contact newContact = Contact.createContact(name,phone);
        samsung.addNewContact(newContact);
    }

    private static void modifyContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = new Contact(newName, newPhone);
        samsung.modifyContact(name, newContact);
    }

    private static void removeContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        samsung.removeContact(name);
    }

    private static void printContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        samsung.printContact(name);
    }

    private static void printInstructions(){
        System.out.println("0  - Shutdown\n" +
                "1  - Print contacts\n" +
                "2  - Add a new contact\n" +
                "3  - Update existing an existing contact\n" +
                "4  - Remove an existing contact\n" +
                "5  - Find existing contact\n" +
                "6  - Print Instructions.");
        System.out.println("Enter a number: ");
    }

/*
    private static void setUp(){
        System.out.println("Samsung starting...");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();
        Contact myContact = new Contact(name, phone);
        samsung.addNewContact(myContact);
        System.out.println("Welcome " + name +", your phone has been set up");
        printInstructions();
    }
    */
}
