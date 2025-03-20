package collection.intro;

public class Product {
    int pid;
    double price;

    Product(int pid, double price) {
        this.pid = pid;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ pid: " + pid + " price: " + price + "}";
    }

    public static void main(String[] args) {
        Product[] kart = new Product[5];
        kart[0] = new Product(1, 600);
        kart[1] = new Product(2, 1600);
        kart[2] = new Product(3, 2600);
        kart[3] = new Product(4, 3600);
        kart[4] = new Product(5, 4600);

        for (int i = 0; i < kart.length; i++) {
            System.out.println(kart[i]);
        }
    }
}