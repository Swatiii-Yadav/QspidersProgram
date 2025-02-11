package JavaProgram.oops.instanceOf;

public class Manager {
    static void assignWork(SoftwareEngineer e){
        if (e!=null){
            e.meeting();
            if (e instanceof Developer){
                Developer d=new Developer();
                d.codding();

            }
            else if(e instanceof  Tester){
                Tester qa=(Tester) e;
                qa.testing();
            }
        }

    }
}
