package numberSystem;

import java.util.Scanner;

public class CountOccuranceOfDigits {
    static int countOccurance(int num, int digit) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter digit:");
        int digit = sc.nextInt();

        int count = countOccurance(num, digit);
        System.out.println("occurence of " + digit + " in " + num + " is: " + count);
    }
}
