package JavaProgram.oops.upCasting;

public class MainClassForPayment
{
    public static void main(String[] args) {
        CreditCard cc=new CreditCard("1234567891112",1000,"12335462378","30-12-2030");
        cc.getCreditCardDetails();
        PaymentMethods p=new PaymentMethods();
        p.getPaymentDetails(cc);


    }
}
