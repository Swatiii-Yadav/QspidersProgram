package collection.InnerClass;

public class Demo {
    static  class Sample{
        void test(){
            System.out.println("Exxecuting test().......");
        }
    }
}
class MainClass{
    public static void main(String[] args) {
        Demo.Sample ref=new Demo.Sample();
        ref.test();
    }
}
