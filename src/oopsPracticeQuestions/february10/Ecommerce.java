package oopsPracticeQuestions.february10;

//	E-commerce System: Product → Electronics, Clothing, Books
//      methods   apply_discount(), get_price(), display_info()
public class Ecommerce {
    String ProductName;
    double price;
    int quantity;

    Ecommerce(String ProductName, double price, int quantity) {
        this.price = price;
        this.ProductName = ProductName;
        this.quantity = quantity;

    }

    double applyDiscount() {
        return quantity * price + price * 0.10;
    }

    double get_price() {
        return price;
    }

    void displayInfo() {
        System.out.println("Product name - " + ProductName + " Quantity- " + quantity + " Total price " + quantity);


    }
}

class Electronics extends Ecommerce {


    Electronics(String ProductName, double price, int quantity) {
        super(ProductName, price, quantity);
    }

    @Override
    double applyDiscount() {
        return super.quantity * price + price * 0.15;
    }

    @Override
    double get_price() {
        System.out.println("Price of Electronic item :");
        return super.price;
    }

    @Override
    void displayInfo() {
        System.out.println("Details of Electronic item:");
        System.out.println("Product name - " + ProductName + " Quantity- " + quantity + " Total price " + quantity);


    }
}

class Clothing extends Ecommerce {
    String size;
    String material;

    Clothing(String ProductName, double price, int quantity, String size, String material) {
        super(ProductName, price, quantity);
        this.size = size;
        this.material = material;
    }

    @Override
    double applyDiscount() {
        return super.quantity * price + price * 0.20;
    }

    @Override
    double get_price() {
        System.out.println("PRice -");
        return super.price;
    }

    String getSize() {
        return size;
    }

    @Override
    void displayInfo() {
        System.out.println("Details of Product");
        System.out.println("Product name - " + ProductName + " Quantity- " + quantity + " Total price " + quantity +
                "size= " + size + " material " + material);


    }
}

class Books extends Ecommerce {
    int bin;//book identification number

    Books(String ProductName, double price, int quantity,int bin) {
        super(ProductName, price, quantity);
        this.bin=bin;
    }

    @Override
    double applyDiscount() {
        System.out.println();
        return super.quantity * price + price * 0.5;
    }

    @Override
    double get_price() {
        System.out.println("Price of book: ");
        return super.price;
    }

    @Override
    void displayInfo() {
        System.out.println("Product name - " + ProductName + " Quantity- " + quantity + " Total price " + quantity+
                "Book identification number: "+bin);


    }
}