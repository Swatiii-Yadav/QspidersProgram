package JavaProgram.oops.abstraction;

public class SmartPhoneManager {
    static void load(Android ad){
        if (ad!=null){
            ad.services();
            ad.ui();
        }
    }
}
