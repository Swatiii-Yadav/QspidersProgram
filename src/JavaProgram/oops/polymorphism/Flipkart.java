package JavaProgram.oops.polymorphism;

public class Flipkart {
    void payment(){
        System.out.println("Cash on delivery");
    }
    void payment(long card){
        System.out.println("10% discount on credit card");
    }
    void payment(String upi){
        System.out.println("5% cashback on  UPI");
    }
}
class MainClassForFlipKart{
    public static void main(String[] args) {
        Flipkart ref=new Flipkart();
        ref.payment();
        ref.payment(123456789112L);
        ref.payment("swati@yeah");
    }
}
