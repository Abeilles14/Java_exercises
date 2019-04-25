/*
 * grocery list class
 */

package com.isabelle;

import java.util.ArrayList;

public class GroceryList {
    private int[] mynumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();      //class, no specify how many numbers

    public void addGroceryItem(String item){
        groceryList.add(item);                          //adds item in arrlist
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println(i+1 + ". "+groceryList.get(i));      //gets item at i
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(newItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }


    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);                              //sets new item at position
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }


    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);                   //removes item at position
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }
        return false;
    }

    private int findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);      //checks if contains item true/false
        return groceryList.indexOf(searchItem);
        /*
        int position = groceryList.indexOf(searchItem);            //finds index of item
        if(position >= -0){
            return groceryList.get(position);
        }
        return null;
        */
    }


}
