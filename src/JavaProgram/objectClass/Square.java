package JavaProgram.objectClass;

public class Square implements Cloneable{
    int side=0;

    public static void main(String[] args)  throws CloneNotSupportedException{
        Square oroginal=new Square();
        oroginal.side=100;
        Square replica=(Square)oroginal.clone();
        System.out.println("replica value :"+replica.side);
        System.out.println("original value :"+oroginal.side);
    }
}
