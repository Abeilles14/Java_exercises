/*
 *isabelle andre
 * 12/06/18
 * if, else, else if statements, can't access local vars
 */

package com.isabelle;

public class Main {

    public static void main(String[] args) {
	    boolean isGameover = true;
	    int nscore = 4000;
	    int nlevel = 5;
	    int nbonus = 100;


	    if(nscore < 5000 && nscore>1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (nscore < 1000) {
            System.out.println("Your score was less than 1000");
	    } else {
            System.out.println("Other");
        }


	    if (isGameover) {
	        int nFinalScore = nscore + (nlevel * nbonus);
	        nFinalScore += 1000;
            System.out.println("Your final score was " + nFinalScore);
        }
        //int nsavedfinalscore = nFinalScore; = false bc out of code block

        //CHALLENGE

        nscore = 10000;
	    nlevel = 8;
	    nbonus = 200;
	    if (isGameover) {
	        int nFinalScore = nscore + (nlevel * nbonus);
            System.out.println("Your final score was " +nFinalScore);
        }


    }
}
