package exceptionHandling.march2;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
 class BankAccount  {
    private  double balance;
   BankAccount(double balance){
       this.balance=balance;
   }
   void withDraw(double amount) throws InsufficientBalanceException{
       if (amount>balance){
           throw new InsufficientBalanceException("Insufficient balance. Total balance available "+balance);
       }
       balance-=amount;
       System.out.println("Withdraw successful of "+amount+". Available balance "+balance);
   }

}
 class MainClassForBankAcc{
     public static void main(String[] args) {
        BankAccount bank1=new BankAccount(5000);
        try {
            bank1.withDraw(4000);

        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
     }
 }