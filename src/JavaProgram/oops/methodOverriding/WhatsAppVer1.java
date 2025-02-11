package JavaProgram.oops.methodOverriding;

public class WhatsAppVer1 {
    void message() {
        System.out.println("Sent");
    }
}

class WhatsAppVer2 extends WhatsAppVer1 {
    @Override
    void message() {
        System.out.println("Sent-delivered");
    }
}

class WhatsAppVer3 extends WhatsAppVer2 {
    @Override
    void message() {
        System.out.println("Sent-delivered-seen");
    }
}

class MainClassForWhatsApp{
    public static void main(String[] args) {
        WhatsAppVer1 w1=new WhatsAppVer1();
        w1.message();

        WhatsAppVer2 w2=new WhatsAppVer2();
        w2.message();

        WhatsAppVer3 w3=new WhatsAppVer3();
        w3.message();

        WhatsAppVer1 ref1=new WhatsAppVer2();
        ref1.message();

        WhatsAppVer2 ref2=new WhatsAppVer3();
        ref2.message();


    }
}