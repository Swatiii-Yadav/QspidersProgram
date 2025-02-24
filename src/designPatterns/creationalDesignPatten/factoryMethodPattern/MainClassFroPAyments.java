package designPatterns.creationalDesignPatten.factoryMethodPattern;

import java.util.Scanner;

public class MainClassFroPAyments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select payment type(Paytm/PhonePay/GooglePay)");
        String paymenType = sc.nextLine();

        PaymentGateWays payment = PaymentFactorryMethod.getPaymentGateway(paymenType);

        payment.processPayment(1500);
    }
}
