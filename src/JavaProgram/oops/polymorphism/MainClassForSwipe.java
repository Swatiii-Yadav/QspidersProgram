package JavaProgram.oops.polymorphism;

public class MainClassForSwipe {
    public static void main(String[] args) {
        Card ref;
        ref=new CreditCard();
        ref.swipe();

        ref=new DebitCard();
        ref.swipe();

        ShopForSwipe.cardPayments(new CreditCard());
        ShopForSwipe.cardPayments(new DebitCard());
    }
}
