package Programming.switchCondition;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 ");
         int num1=sc.nextInt();
        System.out.println("Enter number 2 ");
        int num2=sc.nextInt();
        System.out.println("Enter operation ");
char operation=sc.next().charAt(0);
int res=0;
        switch (operation){
            case '+':
                res=num1+num2;
                System.out.println(res);
                break;
            case '-':
                res=num1-num2;
                System.out.println(res);
                break;
            case '*':
                res=num1*num2;
                System.out.println(res);
                break;
            case '/':
                res=num1/num2;
                System.out.println(res);
                break;
            case '%':
                res=num1%num2;
                System.out.println(res);
                break;
            default:{
                System.out.println("Invalid operation");
            }
        }
    }
}
