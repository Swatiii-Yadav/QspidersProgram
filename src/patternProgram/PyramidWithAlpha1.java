package patternProgram;

import java.util.Scanner;

public class PyramidWithAlpha1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();

        for (int i = 1; i<=n; i++) {

            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int c=1;
            for (int k = 1; k <=(2*i)-1 ; k++) {
                System.out.print((char) (64 + c) + " ");
                if ( k <i ) {
                    c++;
                } else {
                    c--;
                }
            }
            System.out.println();
        }
    }
}
