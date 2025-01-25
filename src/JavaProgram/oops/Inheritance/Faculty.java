package JavaProgram.oops.Inheritance;

//example of hierarchical Inheritance
public class Faculty {
        float salary=30000;

}
class Science extends Faculty
{
    float bonus=2000;

}
class Economics extends Faculty
{
    float bonus=3000;

}
class MainClassForFaculty{
    public static void main(String args[])
    {

        Science scs=new Science();
        System.out.println("Salary is:"+scs.salary);
        System.out.println("Bonous is:"+scs.bonus);

        Economics ec=new Economics();
        System.out.println("Salary is:"+ec.salary);
        System.out.println("Bonous is:"+ec.bonus);
    }
}