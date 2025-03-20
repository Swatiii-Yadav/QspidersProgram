package collection.intro;

public class Employee {
    String role;
    int cid;
    double ctc;

    Employee(String role, int cid, double ctc) {
        this.role = role;
        this.cid = cid;
        this.ctc = ctc;
    }

    @Override
    public String toString() {
        return "[ role :" + role + " eid: " + cid + " ctc " + ctc + "]";
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("developer", 101, 55);
        emp[1] = new Employee("tester", 102, 45);
        emp[2] = new Employee("manager", 103, 75);
        emp[3] = new Employee("analyst", 104, 25);
        emp[4] = new Employee("QA", 105, 15);
        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].ctc>max){
                max=emp[i].ctc;

        }
        }
        System.out.println(max);

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].ctc<min){
                min=emp[i].ctc;

            }
        }
        System.out.println(min);
    }
}

