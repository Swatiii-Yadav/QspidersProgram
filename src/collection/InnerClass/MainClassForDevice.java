package collection.InnerClass;

public class MainClassForDevice {
    public static void main(String[] args) {

        Mobile mobile=new Mobile();
        Spotify spf=new Spotify();
        mobile.install(spf);
        mobile.install(new WhatsApp());
        mobile.install(new OutLook());
        System.out.println(mobile.list.size());
        mobile.uninstall(spf);
        System.out.println(mobile.list.size());
        Adapter ada= mobile.adapter();
        ada.adapt();

//        Laptop laptop=new Laptop();

    }
}
