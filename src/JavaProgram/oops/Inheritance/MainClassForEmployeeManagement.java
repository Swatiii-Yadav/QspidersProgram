package JavaProgram.oops.Inheritance;

public class MainClassForEmployeeManagement {
    public static void main(String[] args) {

        System.out.println("Details of Employee : ");
        GeneralEmployee e1 = new GeneralEmployee(121, "jim", 1569.76);
        System.out.println("Annual salary of Employee id " + e1.empID + " = " + e1.calculateTotalSalary());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Details of Manager : ");
        GeneralManager m1 = new GeneralManager(32, "michael", 1569.76, 4, 500);
        System.out.println("Annual salary of  with bonus of Employee id " + e1.empID + " = " + m1.calculateSalaryWithBonus());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Details of Intern : ");
        Intern i1 = new Intern(11, "pam", 4500.45);
        System.out.println(" salary of Intern  " + i1.empID + " = " + i1.calcStipend());
        System.out.println("--------------------------------------------------------------------------");


    }
}
