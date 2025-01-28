package JavaProgram.oops.Inheritance;

import java.util.Scanner;


public class MainClassForEcommerceProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of product");
        String name = sc.nextLine();

        System.out.println("Category of product");
        String category = sc.nextLine();

        System.out.println("Price of product");
        double price = sc.nextDouble();
        sc.nextDouble();



        System.out.println("Product details");
        System.out.println("-------------------------------------------------");
        EcommerceProduct ec1 = new EcommerceProduct(name, category, price);
        ec1.display();
        System.out.println("Warranty period:");
        int warrantyPeriod = sc.nextInt();
        System.out.println("Electronic Product details");
        System.out.println("-------------------------------------------------");
        ElectronicProducts e1 = new ElectronicProducts(name, category, price, warrantyPeriod);
        e1.displayElectronics();

        System.out.println("Ram size :");
        int Ram = sc.nextInt();
        System.out.println("Mobile details");
        System.out.println("-------------------------------------------------");
        Mobile m1 = new Mobile(name, category, price, warrantyPeriod, Ram);
        m1.displayMobile();


    }
}
