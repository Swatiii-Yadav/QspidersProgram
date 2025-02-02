package JavaProgram.oops.upCasting;

public class MainClassForProduct {
    public static void main(String[] args) {
        Television tv=new Television();
        FlipKart.addToKart(tv);

        Laptop lap=new Laptop();
        FlipKart.addToKart(lap);

        Mobile mob=new Mobile();
        FlipKart.addToKart(mob);
    }
}
