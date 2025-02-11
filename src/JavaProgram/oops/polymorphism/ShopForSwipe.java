package JavaProgram.oops.polymorphism;

public class ShopForSwipe {
    static void cardPayments(Card c){
        if (c!=null){
            c.swipe();
        }
    }
}
