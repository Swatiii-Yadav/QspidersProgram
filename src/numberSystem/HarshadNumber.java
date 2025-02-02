package numberSystem;

import java.util.Scanner;

public class HarshadNumber {
    static void checkNumber(int num) {
        int sum = getSumOfDigits(num);
        if (num % sum == 0) {
            System.out.println(num + " is niven or harshad number");
        } else {
            System.out.println("Not a harshad number");
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
        System.out.println("Enter num: ");
        int num=sc.nextInt();
        checkNumber(num);
    }
}
