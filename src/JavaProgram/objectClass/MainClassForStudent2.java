package JavaProgram.objectClass;

class Student{
    String name;
  private   int regNo;
    double cgpa;
    Student(String name,int regNO,double cgpa){
        this.name=name;
        this.cgpa=cgpa;
        this.regNo=regNO;
    }
    @Override
    public  boolean equals(Object obj){
        Student st=(Student) obj;
        if(this.regNo==st.regNo){
            return true;
        }
        else {
            return false;
        }
    }
}
public class MainClassForStudent2 {
    public static void main(String[] args) {
        Student s1=new Student("Swati",1235678,8.9);
        Student s2=new Student("Swati",1235678,8.8);
        
        System.out.println(s1.equals(s2));


    }
}
