package Qspider.oops;

public class Food {
    Food(int a){
        System.out.println("daal rice");
    }
    Food(double d){
        System.out.println("Halwa");
    }
    Food(String z){
        System.out.println("Paratha");
    }
    public static void main(String[] args) {
        Food f1=new Food(5);
        Food f2=new Food(6.8);
        Food f3=new Food("abs");
    }
}
