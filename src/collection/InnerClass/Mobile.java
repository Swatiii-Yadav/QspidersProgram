package collection.InnerClass;

import java.util.ArrayList;
import java.util.List;

public class Mobile implements Device{
   ArrayList<Application> list=new ArrayList<>();

    @Override
    public Adapter adapter() {
        Adapter a=new Adapter() {
            @Override
            public void adapt() {
                System.out.println("Mobile adapter");
            }
        };
        return a;
    }

     @Override
     public void install(Application a) {
         if (a != null) {
             list.add(a);
             String s=a.toString();
             System.out.println(s.substring(s.indexOf('@'))+" Installed ");
         }
     }

     @Override
     public void uninstall(Application a) {
         if (a != null) {
             list.remove(a);
             String s=a.toString();
             System.out.println(s.substring(s.indexOf('@'))+" Uninstalled ");

         }

     }
 }
