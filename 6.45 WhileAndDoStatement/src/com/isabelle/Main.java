/*
 * isabelle andre
 * 15/06/18
 * prints numbers with while loops vs for loops vs do loops
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
	    int counter = 1;
	    while(counter !=5){                                     //while loop
            System.out.println("Count value is " +counter);
            counter++;
        }

        for(int i=1; i < 5; i++) {                          //for loop
            System.out.println("Count value is " +i);
        }

        counter = 1;
        while(true){                                         //while true loop
	        if (counter ==5){
	            break;
            }
            System.out.println("Count value is " +counter);
	        counter++;
        }

        counter = 1;
        do {                                                  //do while loop
            System.out.println("Count value is" +counter);
            counter++;
        } while (counter !=5);

        //CHALLENGE

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {                    //while continue loop
                continue;                                   //if odd number, reloop
            }
            count++;
            System.out.println("Even number " +number);
            if (count == 5){
                break;
            }
        }
        System.out.println("Total even number found = " +count);


    }

    public static boolean isEvenNumber (int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
