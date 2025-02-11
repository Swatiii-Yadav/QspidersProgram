package JavaProgram.oops.abstraction;

public class HotstarAccessManager {
    static  void controlAccess(HotStar hs){
        if (hs!=null){
            hs.login();
            hs.watch();
        }
    }
}
