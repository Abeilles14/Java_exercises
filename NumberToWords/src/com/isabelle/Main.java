/*
 * isabelle andre
 * 25/06/18
 * Turns numbers into String complex way (counts leading zeros, reverses number, prints number, adds leading zeros)
 */


package com.isabelle;


public class Main {

    public static void main(String[] args) {
        numberToWords(100);
    }

    public static void numberToWords (int number) {
        int last;
        int num = reverse (number);                                     //reverse of number
        int zeros = getDigitCount(number) - getDigitCount(num);         //finds number of leading zeros(difference in digits)

        if (num < 0) {
            System.out.println ("Invalid Value");
        }

        do {
            last = num % 10;
            num /= 10;

            switch (last) {                                             //prints digits
                case 0:
                    System.out.println ("Zero");
                    break;
                case 1:
                    System.out.println ("One");
                    break;
                case 2:
                    System.out.println ("Two");
                    break;
                case 3:
                    System.out.println ("Three");
                    break;
                case 4:
                    System.out.println ("Four");
                    break;
                case 5:
                    System.out.println ("Five");
                    break;
                case 6:
                    System.out.println ("Six");
                    break;
                case 7:
                    System.out.println ("Seven");
                    break;
                case 8:
                    System.out.println ("Eight");
                    break;
                case 9:
                    System.out.println ("Nine");
                    break;
            }
        } while (num > 0);

        if (getDigitCount(number) != getDigitCount(num)) {
            for (int i = 1; i <= zeros; i++ ) {
                System.out.println("Zero");
            }

        }

    }

    public static int reverse (int number) {                        //finds reverse of number
        int last;
        int reverse = 0;
        boolean neg = false;

        if (number < 0) {
            number *= -1;
            neg = true;
        }

        while (number > 0) {
            last = number % 10;
            reverse = (reverse * 10) + last;
            number /= 10;
        }

        if (neg) {
            reverse *= -1;
        }
        return reverse;
    }

    public static int getDigitCount (int number) {                  //counts digits in number
        int digits = 0;

        if (number < 0) {
            return -1;
        }

        do {
            number /= 10;
            digits++;
        } while (number > 0);

        return digits;
    }
}
