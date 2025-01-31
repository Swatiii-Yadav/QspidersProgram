package numberSystem;

import java.util.Scanner;

public class NtoPowerP {
   static  int  findPower(int num,int pow) {
        int res=1;
        for (int i=1;i<=pow;i++){
            res=res*num;
        }
      return res ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Enter Power: ");
        int pow = sc.nextInt();
        System.out.println(findPower(num,pow));
    }
}
