package com.isabelle;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int column = 1; column <= number; column++) {                //prints out columns
                for (int row = 1; row <= number; row++) {                       //prints out rows

                    if (column == 1 || column == number) {                  //if first or last row, *
                        System.out.print("*");
                        continue;
                    }
                    if (row == 1 || row == number || column == row || column == number - row + 1) {     //if first or last col, row = col, col = number - row +1, *
                        System.out.print("*");
                    } else {
                        System.out.print(" ");                                              //else print " "
                    }

                }
                System.out.println();                                       //next line
            }
        }
    }
}
