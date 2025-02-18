package arrayPrograms;

import java.util.Scanner;

public class CountPalindromeInArr {
    static boolean isPalindrome(int num){
        int rem=0,temp=num,rev=0;
        while (temp>0){
            rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        if (num==rev){
           return true;
        }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (isPalindrome(arr[i])){
                count++;
            }
        }
        System.out.println(count+" palindrome number are present in array");

    }
}
