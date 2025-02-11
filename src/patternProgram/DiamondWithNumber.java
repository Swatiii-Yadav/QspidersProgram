package patternProgram;

import java.util.Scanner;

public class DiamondWithNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //upper part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            //upper part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
