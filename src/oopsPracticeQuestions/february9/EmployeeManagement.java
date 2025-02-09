package oopsPracticeQuestions.february9;


//Employee Management System: Employee → Manager, Developer
//	work(), get_salary(), show_role()
public class EmployeeManagement {
    int id;
    String department;
    double salary;

    EmployeeManagement(int id, String department, double salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void work() {
        System.out.println("Employee with "+id+" in "+department+" getting salary"+salary);
    }

    String department(String dept) {
        return dept;
    }

}

class Management extends EmployeeManagement {
    double comm;
    Management(int id, String department, double salary,double comm) {
        super(id, department, salary);
        this.comm=comm;
    }

    void manage() {
        System.out.println("Employee with "+id+" manage "+department);

    }

    @Override
    double getSalary(){
        return super.salary+comm;
    }
    @Override
    void work() {
        System.out.println("Employee with "+id+" in "+department+" getting salary"+salary+"and commision"+comm);
    }

}

class Development extends EmployeeManagement {
    String project;


    Development(int id, String department, double salary,String project) {
        super(id, department, salary);
        this.project=project;
    }


    @Override
    double getSalary(){
        return super.salary+(salary*0.10);
    }
    @Override
    void work() {
        System.out.println("Employee with "+id+" in "+department+" getting salary"+salary+" working on "+project);
    }

}

