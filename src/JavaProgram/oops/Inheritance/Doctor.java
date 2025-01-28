package JavaProgram.oops.Inheritance;

import javax.print.Doc;

/**
 * Doctors:
 *
 * Attributes: Name, Doctor ID, Base Salary.
 * Behaviors: Calculate Salary (Base Salary).
 *
 * Surgeons (inherits from Doctors):
 *Additional Attributes: Number of Surgeries Performed, Bonus Per Surgery.
 * Behaviors: Calculate Salary (Base Salary + Number of Surgeries × Bonus Per Surgery).
 *
 *
 * Nurses (inherits from Doctors):
 Additional Attributes: Overtime Hours, Overtime Pay Rate.
 * Behaviors: Calculate Salary (Base Salary + Overtime Hours × Overtime Pay Rate).
 */

public class Doctor {

    String name;
    int DocId;
    double salary;

    Doctor(int DocId, String name, double salary) {
        this.DocId= DocId;
        this.name = name;
        this.salary = salary;

    }

    public double calculateBaseSalary() {
        return this.salary;
    }
}
class Surgeons extends Doctor{
     int NoOfSurgeries;
     double bonusPerSurgery;
    Surgeons(int DocId, String name, double salary,int NoOfSurgeries,double BonusPerSurgery) {
        super(DocId, name, salary);
        this.NoOfSurgeries=NoOfSurgeries;
        this.bonusPerSurgery=BonusPerSurgery;
    }
    double calculateSalaryWithBonus(){
        return  this.salary + NoOfSurgeries*bonusPerSurgery;
    }
}
class Nurse extends Doctor{
    int OvertimeHours;
   double  OvertimePayRate;

    Nurse(int DocId, String name, double salary,int OvertimeHours,double OvertimePayRate) {
        super(DocId, name, salary);
        this.OvertimeHours=OvertimeHours;
        this.OvertimePayRate=OvertimePayRate;
    }
    double calculateSalaryWithBonus(){
        return  this.salary +  OvertimeHours*OvertimePayRate;
    }
}
