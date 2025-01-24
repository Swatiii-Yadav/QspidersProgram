package JavaProgram.oops.Inheritance;

public class Alpha {
void play(){
    System.out.println("Executing play...");
}
}
class Beta extends Alpha{
    void rum(){
        System.out.println("Executing play...");
    }
}
class MainClass{
    public static void main(String[] args) {
        Beta ref=new Beta();
        ref.rum();
        ref.play();
    }
}

