/*
 *isabelle andre
 * 12/06/18
 * Void methods, returning value methods, parameters
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {        //calls methods
        boolean isgameOver = true;
        int nscore = 800;
        int nlevel = 5;
        int nbonus = 100;

        calculateScore (isgameOver, nscore, nlevel, nbonus);

        calculateScore(true, 10000, 8, 200);

        int nHighScore = returnScore (false, nscore, nlevel, nbonus);
        System.out.println(nHighScore);

        //CHALLENGE
        int nPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Isabelle", nPosition);

    }

    public static void calculateScore(boolean isgameOver, int nscore, int nlevel, int nbonus){  //procedure prints score

        if (isgameOver){
            int nFinal = nscore + (nlevel * nbonus);
            nFinal += 1000;
            System.out.println("Your final score was " +nFinal);
        }
    }

    public static int returnScore(boolean isgameOver, int nscore, int nlevel, int nbonus){  //method returns score

        if (isgameOver){
            int nFinal = nscore + (nlevel * nbonus);
            nFinal += 1000;
            return nFinal;
        }
        return -1;
    }

    //CHALLENGE

    public static void displayHighScorePosition(String sName, int nPosition) {       //prints name and position
        System.out.println(sName +" managed to get into position " +nPosition +" on the high score table");
    }

    public static int calculateHighScorePosition (int nscore) {
        if (nscore >= 1000) {
            return 1;
        } else if (nscore >= 500) {
            return 2;
        } else if (nscore >= 100); {
            return 3;
        } else {
            return 4;
        }

        /*
        int nposition = 4;
        if (nscore >= 1000) {
            nposition = 1;
        } else if (nscore >= 500) {
            nposition = 2;
        } else if (nscore >= 100) {
            nposition = 3;
        }
        return nposition;
        */
    }
}
