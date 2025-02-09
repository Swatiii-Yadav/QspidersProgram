package oopsPracticeQuestions.february9;

/**Banking System: Account as parent, CheckingAccount as child classes
 * deposit(), withdraw(), check_balance()  are different method for diff operations
 */

public class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double withdrawmoney) {
        if (balance >= withdrawmoney) {
            balance -= withdrawmoney;
            return withdrawmoney;
        } else {
            System.out.println("Balance is less than withdrawal money");
            return balance;
        }
    }

    double checkBalance() {

        System.out.println(" current balance");
        return balance;
    }

}

class CheckingAccount extends Account {
    double amount = 500;

    CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    double deposit(double withdrawAmount) {
        balance += amount;
        return super.deposit(withdrawAmount);
    }

    @Override
    double checkBalance() {
        return super.checkBalance();
    }
}
