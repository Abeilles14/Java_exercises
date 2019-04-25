/*
 * isabelle andre
 * 02/01/19
 * print prime numbers from 1 - 100
 */

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            if(prime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean prime(int number) {
        for(int i=2; i<Math.sqrt(number); i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}