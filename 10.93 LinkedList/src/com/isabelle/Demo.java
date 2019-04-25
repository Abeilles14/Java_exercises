/*
 * demo class
 */

package com.isabelle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {            //psvm shortcut
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");

        addInOrder(placesToVisit, "Alice Springs");             //added successfully
        addInOrder(placesToVisit, "Darwin");                    //duplicated
        printList(placesToVisit);
        visit(placesToVisit);

        /*
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");


        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");                  //add at index 1
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
        */
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();                      //like for loop printing
        while(i.hasNext()){                                             //while likedList is pointing to something else (not end)
            System.out.println("Now visiting " +i.next());
        }
        System.out.println("*********************");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();                //more methods than Iterator, not pointing to first entry, use .next()

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);         //returns number
            if (comparison == 0) {                                               //if equal do not add
                System.out.println(newCity + " is already included as destination");
                return false;
            } else if (comparison > 0) {                   //new City should appear before this one, brisbane -> adelaide
                stringListIterator.previous();              //add before city being compared
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {                  //passed through whole list, item goes at end
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){           //loads itinerary
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;                                    //locations will duplicate when changing directions without flag
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){                                           //if linked list empty
            System.out.println("No cities in the itinerary");
            return;
        } else {                                                        //prints first destination
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
         while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();                                         //input whether go next or previous city
            switch(action){
                case 0:                                                 //quit
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:                                      //iterator needs an extra to change direction
                    if(!goingForward) {                      //if going backwards
                        if(listIterator.hasNext()){         //if not at end of list
                            listIterator.next();            //change direction
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){                          //go to next location if not last
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()){                        //go previous location if not first
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
         }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - quit\n" +
        "1 - go to next city\n" +
        "2 - go to previous city\n" +
        "3 - print menu options");
    }
}
