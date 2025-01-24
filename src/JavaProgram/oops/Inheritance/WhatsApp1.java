package JavaProgram.oops.Inheritance;

public class WhatsApp1 {
   void chat(){
       System.out.println("Chat Feature");
   }
}
 class WhatsApp2 extends WhatsApp1 {
    void call(){
        System.out.println("calling Feature");
    }
}
class WhatsApp3 extends WhatsApp2 {
    void status(){
        System.out.println("status Feature");
    }
}
class MainClass3{
    public static void main(String[] args) {
        WhatsApp1 w1=new WhatsApp1();
        w1.chat();

        WhatsApp2 w2=new WhatsApp2();
        w2.chat();
        w2.call();

        WhatsApp3 w3=new WhatsApp3();
        w3.chat();
        w3.call();
        w3.status();
    }
}