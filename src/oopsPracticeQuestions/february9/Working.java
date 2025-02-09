package oopsPracticeQuestions.february9;

public class Working extends Employee implements Student {
    int hours;
    String name;
    String university;
    String course;


    Working(int empId, String company, double salary, int hours, String name, String university, String course) {
        super(empId, company, salary);
        this.hours = hours;
        this.name = name;
        this.university = university;
        this.course = course;


    }

    @Override
    public String getCourse() {
        return course;
    }

    @Override
    public int getEnrollmentNo() {
        return empId ;
    }

    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public void work() {
        System.out.println("Student with " + getEnrollmentNo()+ "and " + name + " at "
                + getUniversity() + " works  part-time" + company + " for " + hours + " hours");
    }
}
