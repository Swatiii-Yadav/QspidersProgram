package numberSystem;

import java.util.Scanner;

public class primeNo {
    static boolean checkPrimeNo(int num){
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
               return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkPrimeNo(num));

    }
}
