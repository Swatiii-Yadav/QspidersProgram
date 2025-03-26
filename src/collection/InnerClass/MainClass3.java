package collection.InnerClass;

 class Utility {

     Runnable runnable=new Runnable() {
         @Override
         public void run() {
             System.out.println("Executing run()....");
         }
     };
     void play(){
         Comparable com=new Comparable() {
             @Override
             public int compareTo(Object o) {
                 System.out.println("Executing compareTo().....");
                 return o.hashCode();
             }
         };
         com.compareTo(new Object());
     }
}
public  class MainClass3{
    public static void main(String[] args) {
        Utility utility=new Utility();
        utility.runnable.run();
        utility.play();
    }
}
