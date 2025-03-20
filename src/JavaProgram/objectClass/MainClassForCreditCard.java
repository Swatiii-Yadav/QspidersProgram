package JavaProgram.objectClass;

class CreditCard{
    private  long cardNo=4100843512349876L;
    private int pin=2456;
    @Override
    public boolean equals(Object obj){
        CreditCard c=(CreditCard) obj;
        if (this.cardNo==c.cardNo && this.pin==c.pin){
            return true;
        }
        else {
            return false;
        }
    }
}
public class MainClassForCreditCard {
    public static void main(String[] args) {
        CreditCard c1=new CreditCard();
        CreditCard c2=new CreditCard();
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);
    }
}
