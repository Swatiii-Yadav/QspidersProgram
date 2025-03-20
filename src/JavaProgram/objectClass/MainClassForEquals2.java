package JavaProgram.objectClass;

class Mobile{
    long imei=34715882345L;
    @Override
    public boolean equals(Object obj){
        Mobile m=(Mobile) obj;
        if (this.imei==m.imei){
            return true;
        }
        else {
            return false;
        }
    }
}
public class MainClassForEquals2 {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        System.out.println(m1.equals(m2));

    }
}
