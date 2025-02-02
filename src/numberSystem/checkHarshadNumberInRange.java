package numberSystem;

import java.util.Scanner;

public class checkHarshadNumberInRange {
    static void checkNumber(int range) {

        for (int i = 1; i <= range; i++) {
            int sum = getSumOfDigits(i);
            if (i % sum == 0) {
                System.out.println(i + " is niven or harshad number");
            }
        }
    }
    static int getSumOfDigits(int num) {
        int rem = 0, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range=sc.nextInt();
        checkNumber(range);
    }
}
