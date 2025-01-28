package JavaProgram.oops.Inheritance;

public  class MainClassForDoctor {
    public static void main(String[] args) {

        System.out.println("Details of Doctor : ");
        Doctor d1 = new Doctor(121, "jim", 45000.76);
        System.out.println(" salary of Doctor id " + d1.DocId + " = " + d1.calculateBaseSalary());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Details of Surgeans : ");
        Surgeons s1 = new Surgeons(32, "michael", 75000.00, 8, 15500);
        System.out.println("salary of Doctor id  with bonus  " + s1.DocId + " = " + s1.calculateSalaryWithBonus());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Details of Nurse : ");
        Nurse n1 = new Nurse(11, "pam", 25500.45,5,5000);
        System.out.println(" salary of Nurse with bonus  " + n1.DocId+ " = " +n1.calculateSalaryWithBonus() );
        System.out.println("--------------------------------------------------------------------------");
    }
}