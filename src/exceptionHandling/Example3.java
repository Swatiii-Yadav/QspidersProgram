package exceptionHandling;

public class Example3 {
  void test(){
      System.out.println("Executing test()..........");
  }
}
  class MainClass{
      public static void main(String[] args) {
          try{
              Example3 d=(Example3) Class.forName("exceptionHandling.MainClass").newInstance();
              d.test();
          }
          catch(ClassNotFoundException e){
              System.out.println("No sucb class exist!!");
          }catch (IllegalAccessException  e){
              System.out.println("accesssss");
          } catch (InstantiationException e) {
              System.out.println("");
          }
      }
}
