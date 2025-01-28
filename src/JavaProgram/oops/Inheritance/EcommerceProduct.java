package JavaProgram.oops.Inheritance;


/**
 *
 Base Class: Product

 Attributes: Name, Price, Category.
 Behaviors: Display product details.

 Child Class: Electronics (inherits from Product)
 Additional Attributes: Warranty Period (in years).
 Behaviors: Display details including warranty period.

 Child Class: Clothing (inherits from Product)
 Additional Attributes: Size, Material.
 Behaviors: Display details including size and material.

 Child Class: Mobile (inherits from Electronics)
 Additional Attributes: Ram size.
 Behaviors: Display details including Ram size.

 Task:
 Create objects for each product category.
 Input details for each type of product.
 Display detailed product information.

 * */
public class EcommerceProduct {
    String name;
    double price;
        String category;

    public EcommerceProduct(String name,String category,double price) {
        this.name=name;
        this.price=price;
        this.category = category;
    }

    void display(){
        System.out.println("Name of Product "+this.name);
        System.out.println("Category of product is "+this.category);
        System.out.println("Price of "+this.name+" is "+this.price);
        }
}
class Clothing extends EcommerceProduct{
    char size;
    String material;

    public Clothing(String name,String category, double price,char size,String material) {
        super(name ,category, price);
        this.size=size;
        this.material=material;
    }

    void ClothsDetails(){
        System.out.println("size of Product "+size);
        System.out.println("material of product is "+material);

    }

}
class ElectronicProducts extends EcommerceProduct{
   int  warrantyPeriod;
    public ElectronicProducts(String name, String category, double price,int warrantyPeriod) {
        super(name, category, price);
        this.warrantyPeriod=warrantyPeriod;
    }
    void displayElectronics(){
        System.out.println("Warranty period  of Product is "+warrantyPeriod);

    }
}
class Mobile extends ElectronicProducts{
    int Ram;

    public Mobile(String name, String category, double price, int warrantyPeriod,int Ram) {
        super(name, category, price, warrantyPeriod);
        this.Ram=Ram;
    }
    void displayMobile(){
        System.out.println("Ram  of  "+name + " is " +Ram);

    }
}

