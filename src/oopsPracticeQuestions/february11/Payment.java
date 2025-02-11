package oopsPracticeQuestions.february11;

/* Payment Gateway (Abstracting Payment Methods)
Abstract Class: Payment
Subclasses: CreditCardPayment, PayPalPayment, UPIPayment
Real-World Use: Online payments follow a standard process but differ in implementation.


* */
abstract class Payment {
    Payment(){

    }
    abstract void processPayment();

}
class CreditCardPayment extends Payment{
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}
class PayPalPayment extends Payment{
@Override
void processPayment() {
    System.out.println("Processing PayPal payment...");
}
}
class UPIPayment     extends Payment{
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment...");
    }
}

class MainClassPayment{
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();
        Payment payment3 = new UPIPayment();
        System.out.println("------------------------");
        payment1.processPayment();
        System.out.println("------------------------");
        payment2.processPayment();
        System.out.println("------------------------");
        payment3.processPayment();

        System.out.println("------------------------");
    }
}