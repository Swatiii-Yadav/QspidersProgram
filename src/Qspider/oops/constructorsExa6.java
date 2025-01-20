package Qspider.oops;

class Product{
    int pid;
    double salary;
    Product(int p,double sal){
        pid=p;
        salary=sal;
    }
}
public class constructorsExa6 {
    public static void main(String[] args) {
        Product p1=new Product(101,500.0);
        System.out.println("Output for p1");
        System.out.println(p1.pid);
        System.out.println(p1.salary);
        Product p2=new Product(102,1500.0);
        System.out.println("Output for p2");
        System.out.println(p2.pid);
        System.out.println(p2.salary);
        Product p3=new Product(103,2500.0);
        System.out.println("Output for p3");
        System.out.println(p2.pid);
        System.out.println(p2.salary);
    }

}
