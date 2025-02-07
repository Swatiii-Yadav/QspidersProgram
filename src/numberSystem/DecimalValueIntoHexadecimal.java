package numberSystem;

import java.util.Scanner;

public class DecimalValueIntoHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        String hex = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            int rem = num % 16;
            hex = hexChars[rem] + hex;
            num = num / 16;
        }
        System.out.println(hex);
    }
}
