package multiThreading;

public class ThreadProg2 extends Thread{
    @Override
    public void run() {
      for (int i=0;i<=5;i++){
          System.out.println(" Demo Threading.......");
      }
    }
}
class MainClass{
    public static void main(String[] args) {
        System.out.println(" Program Starts ");
        ThreadProg2 pg=new ThreadProg2();
        pg.start();
        for (int i=0;i<=5;i++){
            System.out.println(" Main thread....");
        }
        System.out.println(" Program Ends ");
    }
}