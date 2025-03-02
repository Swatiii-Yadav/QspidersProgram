package exceptionHandling.march2;

public class ShoppingKart {
    int productQuantity;
    ShoppingKart(int productQuantity){
        this.productQuantity=productQuantity;
    }

    void addToKart(int itemQuantity){
        if (itemQuantity>productQuantity){
            throw  new NullPointerException();
        }
        productQuantity-=itemQuantity;
        System.out.println(itemQuantity+" unit added to kart.");
    }
}
class MainClassForShoppingKart{
    public static void main(String[] args) {
        ShoppingKart shop=new ShoppingKart(6);
        try{
            shop.addToKart(6);
        } catch (NullPointerException e) {
            System.out.println("Only "+shop.productQuantity+" unit available  ");
        }
    }
}