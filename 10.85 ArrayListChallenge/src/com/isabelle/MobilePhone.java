/*
 * mobile phone class, can store, modify, remove, query contact names
 */
package com.isabelle;

import java.util.ArrayList;

public class MobilePhone {
    private String myName;
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myName, String myNumber){
        this.myName = myName;
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
        //Contact me = new Contact(myName, myNumber);
        //addNewContact(me);
    }

    public void printList(){                                                                    ///////////////////
        System.out.println("You have " +myContacts.size() + " contacts");
        for (int i=0; i<myContacts.size(); i++){
            printContact(myContacts.get(i).getName());
        }
    }

    public void addNewContact(Contact contact){
        int position = findContact(contact.getName());
        if (position >= 0){
            existingContact();
        } else {
            myContacts.add(contact);
            System.out.println("Contact added");
            System.out.println("You have " +myContacts.size() +" contacts");
        }
    }

    public void modifyContact(String name, Contact newContact){
        int position = findContact(name);
        if (position < 0){
            nonexistingContact();
        } else if (findContact(name) > 0) {
            existingContact();
        } else {
            myContacts.set(position,newContact);
            System.out.println("Contact has been modified");
        }
    }

    public void removeContact (String name){
        int position = findContact(name);
        if (position < 0) {
            nonexistingContact();
        } else {
            myContacts.remove(position);
            System.out.println("Contact removed");
        }
    }

    public void printContact(String name){
        int position = findContact(name);
        if (position < 0) {
            nonexistingContact();
        } else {
            System.out.println("Printing contact");
            System.out.println(myContacts.get(position).getName());
            System.out.println(myContacts.get(position).getPhone());
        }
    }

    private void nonexistingContact(){
        System.out.println("Contact does not exist");
    }
    private void existingContact(){
        System.out.println("Contact already exists");
    }

    private int findContact(String name){
        for(int i=0; i<myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}