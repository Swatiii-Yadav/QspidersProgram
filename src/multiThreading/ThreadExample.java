package multiThreading;

    class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            }
        }
    }

    public class ThreadExample {
        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            t1.start(); // Starts a new thread
            t2.start();
            t2.run();// Starts another thread
        }
    }


