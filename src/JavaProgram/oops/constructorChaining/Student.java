package JavaProgram.oops.constructorChaining;

public class Student {
    public Student() {
        System.out.println("Personal Information");
        System.out.println("Academic  Information");

    }
    public Student(int exp) {
        this();
        System.out.println("Experience Information");

    }

    public static void main(String[] args) {
        Student  s1=new Student(4);
    }
}
