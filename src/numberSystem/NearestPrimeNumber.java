package numberSystem;

import java.util.Scanner;

public class NearestPrimeNumber {
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int findNearest(int num) {
        if (isPrime(num)) {
            return num;
        }
        int low=num-1;
        int high=num+1;
        while (low>1 && !isPrime(low)){
            low--;
        }
        while (!isPrime(high)){
            high++;
        }
        if (num - low <= high - num) {
            return low;}

            return high;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findNearest(num));
    }
}
