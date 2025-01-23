package numberSystem;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 27697;
        int rem = 0, prod = 1;
        while (num > 0) {
            rem = num % 10;
            prod *= rem;
            num = num / 10;

        }
        System.out.println(prod);
    }
}
