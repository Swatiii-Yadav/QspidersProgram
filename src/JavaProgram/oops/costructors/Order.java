package JavaProgram.oops.costructors;

/*
 * In an online shopping application, you may need a class Order to represent a customer's order.
 *  When an order is created, the system should initialize its attributes, such as the order ID,
 *  customer name, and order total. Constructors can be used to automate this initialization.*/
public class Order {
    int orderId;
    String CustName;
    double orderTotal;

    Order(int orderId, String name, double total) {
        orderId = orderId;
        CustName = name;
        orderTotal = total;
    }

    public static void main(String[] args) {

    }
}
