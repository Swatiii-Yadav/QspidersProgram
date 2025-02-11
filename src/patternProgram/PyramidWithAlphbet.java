package patternProgram;

import java.util.Scanner;

public class PyramidWithAlphbet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //upper part
            for (int j = 'A'; j <= n-'A'; j++) {
                System.out.print(j+" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
