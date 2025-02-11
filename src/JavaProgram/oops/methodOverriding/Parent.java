package JavaProgram.oops.methodOverriding;

public class Parent {
    void marriage(){
        System.out.println("Arrange marriage");
    }
}

 class Child extends Parent {
    @Override
    void marriage(){
        System.out.println("Forced Arrange marriage");
    }
}
class MainClassForParent{
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.marriage();

        Child c1=new Child();
        c1.marriage();

        Parent ref=new Child();
        ref.marriage();
    }
}
