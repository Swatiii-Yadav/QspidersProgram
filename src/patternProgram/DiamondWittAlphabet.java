package patternProgram;

import java.util.Scanner;

public class DiamondWittAlphabet {
    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n:");
            int n = sc.nextInt();

            int st=1,space=n/2;
            for (int i = 1; i <= n; i++) {
                for (int j=1;j<=space;j++){
                    System.out.print("  ");

                }
                for (int j=1;j<=st;j++){
                    System.out.print((char)(i+64)+" ");
                }
                if (i<=(n/2)){
                    space--;
                    st=st+2;
                }
                else {
                    space++;
                    st=st-2;
                }
                System.out.println();
            }
        }
    }
}
