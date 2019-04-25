/*
 *isabelle andre
 * 12/06/18
 * different operators, how to increment, if statements, boolean and inequalities
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
        int nResult = 1 + 2;
        System.out.println("1 + 2 = " + nResult);

        int nPreviousResult = nResult;
        nResult = nResult - 1;
        System.out.println(nPreviousResult + " - 1 = " + nResult);

        nPreviousResult = nResult;
        nResult = nResult * 10;
        System.out.println(nPreviousResult + " * 10 = " + nResult);

        nPreviousResult = nResult;
        nResult = nResult / 5;
        System.out.println(nPreviousResult + " / 5 = " + nResult);

        nPreviousResult = nResult;
        nResult = nResult % 3;
        System.out.println(nPreviousResult + " % 3 = " + nResult);

        nPreviousResult = nResult;
        nResult = nResult + 1;
        System.out.println("Result is now " + nResult);
        nResult++;                                              //result +1
        System.out.println("Result is now " + nResult);
        nResult--;                                              //result -1
        System.out.println("Result is now " + nResult);
        nResult += 2;                                           //result +2
        System.out.println("Result is now " + nResult);
        nResult *= 10;                                          //result *10
        System.out.println("Result is now " + nResult);
        nResult -= 10;                                           //result -10
        System.out.println("Result is now " + nResult);
        nResult /= 10;                                           //result /10
        System.out.println("Result is now " + nResult);

        boolean isAlien = false;
        if (isAlien == false)                                       //equal
            System.out.println("It is not an alien!");

        int nScore = 100;
        if(nScore != 100)                                           //not equal
            System.out.println("You did not get the high score");

        int nTopScore = 100;
        if(nTopScore >= 100)                                        //greater or equal
            System.out.println("You got the high score!");

        nTopScore = 80;
        int nTopScore2 = 60;
        if ((nTopScore > nTopScore2) && (nTopScore < 100))          //and operator
            System.out.println("Greater than 2nd top score and less than 100");

        if ((nTopScore > 80) || (nTopScore2 <= 90))                 //or operator
            System.out.println("At least one of these tests is true");

        boolean isCar = true;
        if (!isCar)                                                  //boolean operator
            System.out.println("This is not supposed to happen");

        boolean isOldCar = isCar ? true : false;                    //ternary operator
        if (isOldCar)
            System.out.println("Old Car is true");

        //CHALLENGE

        double dvalue1 = 20;
        double dvalue2 = 80;
        double dnew = (dvalue1 + dvalue2) *25;
        double dremainder = dnew % 40;
        if (dremainder <= 20)
            System.out.println("Total was over the limit");
    }
}
