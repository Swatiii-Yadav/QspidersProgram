package JavaProgram.oops.Inheritance;

public class Script1 {
    void executeTest(){

    }
}
class Script2 extends Script1{
    void generateReport(){
        System.out.println();
    }
}
class MainClass4{
    public static void main(String[] args) {
        Script1 s1=new Script1();
        s1.executeTest();

        Script2 s2=new Script2();
        s2.executeTest();
        s2.generateReport();
    }
}