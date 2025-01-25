package JavaProgram.oops.Inheritance;

//example of Hybrid Inheritance

public class Product {
    int pid;
    double price;

}

class Electronics extends Product {
    int rating;
}

class television extends Electronics {
    int displaySize;

}

class WashingMachine extends Electronics {
String type;
}
class Refridgerator extends Electronics {
     int doors;
}

class MainClassForProduct{
    public static void main(String[] args) {
        Product p=new Product();


        WashingMachine wsm=new WashingMachine();
        System.out.println("Information of Washing Machine:");
        System.out.println(wsm.pid=12354);
        System.out.println(wsm.price=25000.0);
        System.out.println(wsm.type="Fully Automatic");

        television tv=new television();
        System.out.println("Information of television:");
        System.out.println(tv.pid=1111);
        System.out.println(tv.price=30000.0);
        System.out.println(tv.displaySize=42);

        Refridgerator ect=new Refridgerator();
        System.out.println("Information of Refridgerator:");
        System.out.println(ect.pid=12354);
        System.out.println(ect.price=45000.0);
        System.out.println(ect.doors=2);
    }
}


