package oopsPracticeQuestions.february9;

 interface Student {
     String getCourse();
     int getEnrollmentNo();
     String getUniversity();
     default void study(){
         System.out.println("Student with "+getEnrollmentNo()+" have enrolled in "+getCourse() +" at "+getUniversity());
     }

}
