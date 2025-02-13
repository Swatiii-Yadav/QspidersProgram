package JavaProgram.oops.abstraction;

public class GoogleTranslate {
    static  void translate(Languages from,Languages to){
        if (from!=null && to!=null){
            from.write();
            System.out.println("to");
            to.write();
        }
    }
}
