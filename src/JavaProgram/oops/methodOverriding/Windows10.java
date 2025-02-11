package JavaProgram.oops.methodOverriding;

public class Windows10 {
void startMenu(){
    System.out.println("listView");
}
}
 class Windows11 extends Windows10 {
    @Override
    void startMenu(){
        System.out.println("Floating window");
    }
}
class MainClassForWindows{
    public static void main(String[] args) {
        Windows10 w10=new Windows10();
        w10.startMenu();

        Windows11 w11=new Windows11();
        w11.startMenu();

        Windows10 w=new Windows11();
        w.startMenu();
    }
}
