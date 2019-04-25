/*
 * isabelle andre
 * 27/06/18
 * checks if sum of big packs (5kg each) and small packs (1kg each) is greater (additional whole packs) or equal to goal
 */
package com.isabelle;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 5));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){ //(2, 4, 13)  --one extra small (3,5,14)
        int totalkg = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount > 0) {
            for (int i = 1; i <= bigCount; i++) {
                if ((i * 5) <= goal) {
                    totalkg += 5;
                }
            }
        }


        if (smallCount > 0) {
            for (int i = 1; i <= smallCount; i++) {
                if ((totalkg + 1) <= goal) {
                    totalkg++;
                }
            }
        }

        System.out.println(totalkg);

        if (totalkg == goal) {
            return true;
        } else {
            return false;
        }

    }

    //ALTERNATIVE
/*
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int check = goal % 5;
            int bigger = 5 * bigCount;
            int sum = bigger + smallCount;

            if (check <= smallCount && sum >= goal) {
                return true;
            } else {
                return false;
            }

        } else {
                return false;
        }
    }       */
}
