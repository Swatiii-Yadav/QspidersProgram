package JavaProgram.objectClass;

class Circle{
    int radius=5;
    @Override
    public boolean equals(Object obj){
        Circle c=(Circle)obj;
        if (this.radius==c.radius){
            return true;
        }
        return false;
    }
}
public class MainClassForEquals {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle();
        System.out.println(c1.equals(c2));
    }
}
