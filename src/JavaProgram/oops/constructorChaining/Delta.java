package JavaProgram.oops.constructorChaining;

public class Delta {

    public Delta() {
        //1
        this(45);
        System.out.println(" 1 Delta() constructor");
    }
    public Delta(int a) {
        //2
        System.out.println(" 2 Delta(int) constructor");
    }
}
class  Example extends Delta{
//3
    public Example() {

        System.out.println(" 3 Example() constructor");
    }
    //4
    public Example(int a) {

        System.out.println(" 4 Example() constructor");
    }
}
class MainClassForDelta{
    public static void main(String[] args) {
//        Example ex=new Example();
        Delta a1=new Delta();


    }
}