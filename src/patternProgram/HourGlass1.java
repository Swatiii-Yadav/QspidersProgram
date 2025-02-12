package patternProgram;

import java.util.Scanner;

public class HourGlass1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for (int i = n; i >= 1; i--) {
                //upper part
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i + (i - 1); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 2; i <= n; i++) {
                //upper part
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i + (i - 1); k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }



    }
}
