package numberSystem;

import java.util.Scanner;

public class CalculateEmployeeSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Salary: ");
        int salary=sc.nextInt();
        double commission=(salary<=10000)?(0.2*salary):(salary<20000)?(0.25*salary):0.3*salary;
        double grossSalary=salary+commission;
        System.out.println("Gross salary of employee: "+grossSalary);

    }
}
