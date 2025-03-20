package multiThreading;

public class RunnableProg1 implements  Runnable {

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println("demo runnable......");
        }
    }
}
class MainClassForRunnable{
    public static void main(String[] args) {
        System.out.println("Program starts");
        RunnableProg1 rp=new RunnableProg1();
        Thread th=new Thread(rp);
        th.start();
        for (int i=0;i<=5;i++){
            System.out.println("main runnable....");
        }
        System.out.println("Program ends");
    }
}
