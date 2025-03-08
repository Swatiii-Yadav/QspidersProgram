package oopsPracticeQuestions.march1TO8;


import java.util.HashMap;
import java.util.Map;

class OrderException extends Exception {
    public OrderException(String message) {
        super(message);
    }
}

 interface EcommerceService {
    void addToCart(String item, int quantity) throws OrderException;
    boolean placeOrder() throws OrderException;
}

public class Myntra implements EcommerceService {

    private Map<String, Integer> cart = new HashMap<>();
    private boolean orderPlaced = false;

    @Override
    public void addToCart(String item, int quantity) throws OrderException {
        if (item.isEmpty() || quantity <= 0) {
            throw new OrderException("Invalid item or quantity.");
        }
        cart.put(item, cart.getOrDefault(item, 0) + quantity);
        System.out.println(quantity + "x " + item + " added to cart.");
    }

    @Override
    public boolean placeOrder() throws OrderException {
        if (cart.isEmpty()) {
            throw new OrderException("Cart is empty.");
        }
        orderPlaced = true;
        System.out.println("Order placed successfully for: " + cart);
        return orderPlaced;

    }
}

