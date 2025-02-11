package JavaProgram.oops.abstraction;

public class MainClassForHotStar {
    public static void main(String[] args) {
        System.out.println("Details of Hotstar free");
        HotstarAccessManager.controlAccess(new HotStarFree());
        System.out.println("--------------------------------------------------");
        System.out.println("Details of Hotstar VIP");
        HotstarAccessManager.controlAccess(new HotStarVIP());
        System.out.println("--------------------------------------------------");
        System.out.println("Details of Hotstar Premium");
        HotstarAccessManager.controlAccess(new HotStarPremium());
        System.out.println("--------------------------------------------------");

    }
}
