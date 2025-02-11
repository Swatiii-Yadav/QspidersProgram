package JavaProgram.oops.abstraction;

public class MainClassForAndroid {
    public static void main(String[] args) {
        SmartPhoneManager.load(new Samsung());
        SmartPhoneManager.load(new Vivo());
        SmartPhoneManager.load(new Oppo());


    }
}
