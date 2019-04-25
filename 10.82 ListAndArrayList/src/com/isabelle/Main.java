/*
 * isabelle andre
 * 28/07/18
 * resize arrays
 */

package com.isabelle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int[] baseData = new int[] {1,2,3,4,5};
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    //resizeArray();

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choices ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("0 - print choice options");
        System.out.println("1 - print list of grocery items");
        System.out.println("2 - add an item to the list");
        System.out.println("3 - modify an item in the list");
        System.out.println("4 - remove an item from the list");
        System.out.println("5 search for an item in the list");
        System.out.println("6 quit the application");
    }

    public static void addItem(){
        System.out.println("Enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item number: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " +searchItem +" in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());                      //copy array

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];     //turn back to array
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    /*
    private static void resizeArray(){                      //resize array
        int[] original = baseData;
        baseData = new int[10];
        for(int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }
    */
}
