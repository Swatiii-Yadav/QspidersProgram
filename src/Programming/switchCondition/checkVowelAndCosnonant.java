package Programming.switchCondition;

import java.util.Scanner;

public class checkVowelAndCosnonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet");
        char alpha=sc.next().charAt(0);
        switch (alpha){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(alpha+" is vowel");
                break;

            default:{
                System.out.println(alpha+" is a consonant");
            }
        }
    }
}
