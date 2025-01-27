package JavaProgram.oops.constructorChaining;

public class Demo {
    Demo(){
        System.out.println("Demo() constructor");
    }
}
class Sample extends Demo{
    Sample(){
        super();
        System.out.println("Sample() constructor");
    }
}

