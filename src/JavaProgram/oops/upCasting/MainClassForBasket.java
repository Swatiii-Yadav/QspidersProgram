package JavaProgram.oops.upCasting;

public class MainClassForBasket {
    public static void main(String[] args) {
        Groceries g=new Groceries();
        BigBasketKart.addToBasket(g);

        Fruits fr=new Fruits();
        BigBasketKart.addToBasket(fr);

        Stationary st=new Stationary();
        BigBasketKart.addToBasket(st);

    }
}
