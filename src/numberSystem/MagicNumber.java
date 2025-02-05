package numberSystem;

import java.util.Scanner;

public class MagicNumber {
    static boolean isMagic(int num) {

        while (num >=10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num=sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int num = sc.nextInt();
        if (isMagic(num)) {
            System.out.println(num + " is magic number");
        } else {
            System.out.println(num + " is   Not a magic number");

        }
    }
}
