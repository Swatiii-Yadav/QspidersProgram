package JavaProgram.oops.Inheritance;


/**
 * Problem Statement:
 * You are developing a simple employee management system for a company.
 * The system needs to manage different types of employees, each with unique attributes and behaviors.
 * The company has the following types of employees:
 * <p>
 * General Employees:
 * Attributes: Name, Employee ID, Base Salary.
 * Behaviors: Calculate Salary (Base Salary).
 * <p>
 * <p>
 * Managers (inherits from General Employee):
 * Additional Attributes: Team Size, Bonus Per Team Member.
 * Behaviors: Calculate Salary (Base Salary + (Team Size × Bonus Per Team Member)).
 * <p>
 * Interns (inherits from General Employee):
 * Additional Attributes: Stipend.
 * Behaviors: Calculate Salary (Stipend instead of Base Salary).
 * <p>
 * Task:
 * Design a class hierarchy using inheritance to represent the above scenario.
 * Write a program to:
 * Create objects for each type of employee.
 * Input relevant details for each employee.
 * Display the calculated salary for each employee type.
 */


public class GeneralEmployee {
    String name;
    int empID;
    double salary;

    GeneralEmployee(int empId, String name, double salary) {
        this.empID = empId;
        this.name = name;
        this.salary = salary;

    }

    public double calculateTotalSalary() {
        return this.salary * 12;
    }
}

class GeneralManager extends GeneralEmployee {
    int teamSize;
    double bonusPeeTeamMember;
    GeneralManager(int empId, String name, double salary,int teamSize,double bonusPeeTeamMember) {
        super(empId, name, salary);
        this.teamSize=teamSize;
        this.bonusPeeTeamMember=bonusPeeTeamMember;

    }
    double calculateSalaryWithBonus(){
        return  this.salary*12 + teamSize*bonusPeeTeamMember;
    }
}
class Intern extends GeneralEmployee{
    double stipend;
    Intern(int empId, String name, double stipend) {
        super(empId, name, 0.0);
        this.stipend=stipend;
    }
    double calcStipend(){
        return this.stipend;
    }

}
