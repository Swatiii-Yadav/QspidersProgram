package JavaProgram.oops.instanceOf;

public class Testing {
    void  Report(){
        System.out.println("Report is executing()..");
    }
}
class ManualTesting extends  Testing{
    void testCase(){
        System.out.println("Test Case is executing()..");

    }
}
class AutomationTesting extends  Testing{
    void testScript(){
        System.out.println("Test Script is executing()..");

    }
}
