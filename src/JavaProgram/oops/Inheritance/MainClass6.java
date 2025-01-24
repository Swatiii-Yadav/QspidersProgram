package JavaProgram.oops.Inheritance;

  class AdobeFree {
    void read(){
        System.out.println("read...");
    }
}
 class AdobePaid  extends  AdobeFree {
    void edit(){
        System.out.println("read...");
    }
}
public class MainClass6{
    public static void main(String[] args) {
        AdobeFree free=new AdobeFree();
        free.read();

        AdobePaid paid=new AdobePaid();
        paid.read();
        paid.edit();
    }
}


