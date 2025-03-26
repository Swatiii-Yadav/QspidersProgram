package collection.InnerClass;

public class Alpha {
    class Beta{
        void test(){
            System.out.println("Executing test().....");
        }
    }
}
  class MainClass1{
      public static void main(String[] args) {

          Alpha.Beta ref=new Alpha().new Beta();
          ref.test();
      }

}
