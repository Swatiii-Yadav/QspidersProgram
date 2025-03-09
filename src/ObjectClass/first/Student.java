package ObjectClass.first;

public class Student {

        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return id ;
        }

        public static void main(String[] args) {
            Student s1 = new Student(101, "Swati ");
            Student s2 = new Student(102, "Yadav");
            System.out.println(s1.hashCode());
            System.out.println(s2.hashCode());
        }
    }

