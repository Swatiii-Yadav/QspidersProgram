package JavaProgram.oops.upCasting;

/**
 * Payment Processing Systems
 * In a payment gateway system, you might have different types of payment methods:
 * CreditCard, DebitCard, and PayPal.
 * All these payment methods can be represented as subclasses of a PaymentMethod superclass.
 * <p>
 * Upcasting: When processing a payment, you can treat all payment types generically as PaymentMethod,
 * allowing the system to call the same method for payment validation or transaction processing.
 * PaymentMethod pm = new CreditCard();
 * processPayment(paymentMethod);
 */

public class Payment {
    String transactionId;
    double amount;

    Payment(String transactionId, double amount) {
        this.amount = amount;
        this.transactionId = transactionId;
    }

    String getTransactionId() {
        return this.transactionId;
    }

    double getAmount() {
        return this.amount;
    }
}

class CreditCard extends Payment {
    String creditCardNo;
    String expDate;

    CreditCard(String transactionID, double amount, String creditCardNo, String expDate) {
        super(transactionID, amount);
        this.creditCardNo = creditCardNo;
        this.expDate = expDate;

    }
      String getCreditCardDetails(){

        return this.creditCardNo;
      }

    String getExpDate(){

        return this.expDate;
    }
}

//class DebitCard {
//
//}
//
//class Paypal {
//
//}
