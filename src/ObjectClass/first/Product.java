package ObjectClass.first;

public class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        boolean res= name.equals(product.name);
        return res;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000);
        Product p2 = new Product("Laptop", 1000);
        System.out.println(p1.equals(p2));
    }
}
