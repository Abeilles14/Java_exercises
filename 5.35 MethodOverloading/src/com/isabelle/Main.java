/*
 *isabelle andre
 * 14/06/18
 * states player name and calculates score, converts inches into feet and cm
 */


package com.isabelle;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Isabelle",500);
        System.out.println("New score is " +newScore);
        calculateScore(75);


        //CHALLENGE
        calcFeetAndInchesToCentimeters(32);
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " +playerName + " scored " +score +" points");
        return score * 1000;
    }
    public static int calculateScore (int score) {          //change of parameters
        System.out.println("Unnamed player scored " +score +" points");
        return score * 1000;
    }

    public static int calculateScore () {                   //change of parameters
        System.out.println("No player name, no player score");
        return 0;
    }

    //CHALLENGE

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double dcm;

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else {
            dcm = ((feet*12) + inches)* 2.54;
            System.out.println(feet +" ft and " +inches +" inches = " +dcm);
            return dcm;
        }

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        double dfeet;
        double dinches;

        if (inches < 0) {
            return -1;
        } else {
            dfeet = (int) (inches/12);
            dinches = (int) (inches % 12);

            System.out.println(inches + " inches = " + dfeet + " ft and " +dinches +" inches");

            return calcFeetAndInchesToCentimeters(dfeet, dinches);
        }
    }


}
