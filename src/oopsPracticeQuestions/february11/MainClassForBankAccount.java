package oopsPracticeQuestions.february11;

import JavaProgram.oops.ObjectAndClass.BankAccount;

public class MainClassForBankAccount {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        SavingAcc sa=new SavingAcc(1234567891L,56700.00);
        sa.deposit(4300).deposit(200);
    }
}
