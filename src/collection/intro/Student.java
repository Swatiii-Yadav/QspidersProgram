package collection.intro;

public class Student {
    String name;
    int yop;
    double cgpa;

    Student(String name, int yop, double cgpa) {
        this.name = name;
        this.yop = yop;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return " name;\n" +name+
                "     yop;\n"+yop +
                "     cgpa;"+  cgpa;
    }

    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student("Swati", 2024, 8.0);
        student[1] = new Student("Swati", 2024, 8.0);
        student[2] = new Student("Swati", 2024, 8.0);
        student[3] = new Student("Swati", 2024, 8.0);
        student[4] = new Student("Swati", 2024, 8.0);
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
    }
}
