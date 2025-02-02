package numberSystem;

import java.util.Scanner;

public class PrimeNoInGivenRange {
    static boolean isPrime(int range) {

        if (range <= 1) {
            return false;
        }
        for (int i = 2; i <= range / 2; i++) {
            if (range % i == 0) {
                return false;
            }

        }


        return true;
    }
    static  void primeNoInRange(int range){
        for (int i = 1; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();
        System.out.println("prime no between "+1 +" to "+range+" are:- ");
        primeNoInRange(range);

    }
}
