package JavaProgram.oops.abstraction;

public class MainClassForLanguages {
    public static void main(String[] args) {
        Hindi hindi=new Hindi();
        English eng=new English();
        Sanskrit snk=new Sanskrit();
        System.out.println("-------------------");
        GoogleTranslate.translate(hindi,eng);
        System.out.println("-------------------");
        GoogleTranslate.translate(eng,hindi);
        System.out.println("-------------------");
        GoogleTranslate.translate(snk,eng);
        System.out.println("-------------------");
       GoogleTranslate.translate(eng,snk);
        System.out.println("-------------------");
        GoogleTranslate.translate(snk,hindi);
        System.out.println("-------------------");
        GoogleTranslate.translate(hindi,snk);

    }
}
