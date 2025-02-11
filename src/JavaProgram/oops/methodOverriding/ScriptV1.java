package JavaProgram.oops.methodOverriding;


public class ScriptV1 {
    void execute(){
        System.out.println("Execute scenario manually");
    }
}

 class ScriptV2 extends ScriptV1 {
    @Override
    void execute(){
        System.out.println("Execute scenario using automation tools");
    }
}
class MainClassForScriptV2{
    public static void main(String[] args) {
        ScriptV1 s1=new ScriptV1();
        s1.execute();

        ScriptV2 s2=new ScriptV2();
        s2.execute();

        ScriptV1 s=new ScriptV2();
        s.execute();
    }
}