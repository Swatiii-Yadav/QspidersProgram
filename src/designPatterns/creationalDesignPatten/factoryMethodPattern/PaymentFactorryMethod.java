package designPatterns.creationalDesignPatten.factoryMethodPattern;

public class PaymentFactorryMethod {
    public static PaymentGateWays getPaymentGateway(String type) {
        switch (type) {
            case "Paytm":
            return new Paytm();

            case "PhonePay":
            return new PhonePay();

            case "GooglePay":
            return new GooglePay();

            default:return null;

        }
    }
}
