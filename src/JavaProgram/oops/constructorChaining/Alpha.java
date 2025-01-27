package JavaProgram.oops.constructorChaining;

public class Alpha {
    int a ;
    Alpha(){
        a=100;
    }
}
class Beta extends  Alpha{
    int b;
    Beta(){
        b=200;
    }
}
class MainClassForAlpha
{
    public static void main(String[] args) {
        Beta b1=new Beta();
        System.out.println("value of a "+ b1.a);
        System.out.println("value of b "+ b1.b);
    }

}
