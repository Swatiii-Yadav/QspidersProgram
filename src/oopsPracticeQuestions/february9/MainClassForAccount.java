package oopsPracticeQuestions.february9;

import java.util.Scanner;

public class MainClassForAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialAmount=5000;
        Account swati = new Account(initialAmount);

        System.out.println("Enter deposit money");
        double deposit=sc.nextDouble();
        System.out.println("withdraw amount from  account "+swati.deposit(deposit));
        System.out.println("Enter withdrawal  money");
        double withdrawal=sc.nextDouble();
        System.out.println("Total available balance  after withdrawal in swati's account "+swati.withdraw(withdrawal));

        CheckingAccount ca=new CheckingAccount(swati.balance);
        System.out.println(ca.checkBalance());

    }
}
