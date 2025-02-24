package designPatterns.creationalDesignPatten.factoryMethodPattern;

interface PaymentGateWays
{
    void processPayment(double amount);
}
class Paytm implements PaymentGateWays{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment via PAyment of  "+amount);
    }
}

class PhonePay implements PaymentGateWays{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment via PhonePAy of  "+amount);
    }
}

class GooglePay implements PaymentGateWays{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment via GooglePAy of  "+amount);
    }
}