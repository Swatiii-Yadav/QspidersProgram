package numberSystem;

import java.util.Scanner;

public class NPrimeNoApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int range = sc.nextInt();
        System.out.println("prime no between "+1 +" to "+range+" are:- ");
        int i=2,count=0;
        while (i<=range){
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                }
                if (count == range) {
                    break;
                }

            i++;
        }

    }
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

}
