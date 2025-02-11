package oopsPracticeQuestions.february11;

//abstracti class implementation

abstract class BankAccount {
    protected long accNumber;
    protected double balance;

    BankAccount(long accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;

    }
    abstract BankAccount deposit(double amount);
}
  class SavingAcc extends  BankAccount{
 protected  double minBalance=1000;

      SavingAcc(long accNumber, double balance) {
          super(accNumber, balance);
      }

      @Override
      SavingAcc deposit(double amount) {
          balance+=amount;
          System.out.println("Total amount:"+balance);
          return this;

      }
  }
