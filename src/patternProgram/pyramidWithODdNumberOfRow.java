package patternProgram;

import java.util.Scanner;

public class pyramidWithODdNumberOfRow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n :");
        int n=sc.nextInt();
        for (int i=1;i<=5;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i+(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
