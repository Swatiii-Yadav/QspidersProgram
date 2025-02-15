package patternProgram;

import java.util.Scanner;

public class PyramidAt180degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str=1;

        for (int i = 1; i <= n*2-1; i++) {
                for (int j = 1; j <= str; j++) {
                    System.out.print(j+" ");
                }
                if (i<n){
                    str++;
                }
                else {
                str--;
                }


            System.out.println();
        }
    }
}
