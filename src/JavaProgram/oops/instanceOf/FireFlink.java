package JavaProgram.oops.instanceOf;

public class FireFlink {
    static  void runTest(Testing t){
        if (t!=null)
        {
            t.Report();
            if (t instanceof  ManualTesting){
                ManualTesting mt=(ManualTesting) t;
                mt.testCase();
            }
            else if(t instanceof AutomationTesting){
                AutomationTesting at=(AutomationTesting) t;
                at.testScript();
            }
        }
    }
}
