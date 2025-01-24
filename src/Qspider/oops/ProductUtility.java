package Qspider.oops;

import java.util.Scanner;

public class ProductUtility {
    static void displayProductInfo(ProductMain p){
        System.out.println("Product Id: "+p.pid);
        System.out.println("Product Price"+p.price);
    }
    static ProductMain createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id: ");
        int pid = sc.nextInt();
        System.out.println("Enter Product Price");
        double price = sc.nextDouble();
        ProductMain p = new ProductMain(pid, price);

        return p;
    }

}
