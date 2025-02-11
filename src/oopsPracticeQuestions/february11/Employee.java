package oopsPracticeQuestions.february11;

abstract class Employee {

        abstract double calculateSalary();
    }



    class FullTimeEmployee extends Employee {
        private double monthSalary;

        FullTimeEmployee(double monthlySalary) {
            this.monthSalary = monthlySalary;
        }

        @Override
        double calculateSalary() {
            return monthSalary;
        }
    }

    class PartTimeEmployee extends Employee {
        private double hourCharge;
        private int hours;

        PartTimeEmployee(double hourCharge, int hours) {
            this.hourCharge = hourCharge;
            this.hours = hours;
        }

        @Override
        double calculateSalary() {
            return  hourCharge* hours;
        }

}

class MainClassForEmployee{
    public static void main(String[] args) {

    }
}
