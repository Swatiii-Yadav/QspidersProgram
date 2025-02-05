package numberSystem;

import java.util.Scanner;

public class NthPrimeNumber {
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
    static  void NPrimeNo(int n){
        int i=2;
     while (i>=2 && i<=n){
            if (isPrime(i))
                i++;

        }
        System.out.println(i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int n = sc.nextInt();
        System.out.println(" Nth prime no "+n);
        NPrimeNo(n);

    }
}
