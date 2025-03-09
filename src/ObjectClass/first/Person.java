package ObjectClass.first;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name="+ name +"',age=" + age + "}";
    }

    public static void main(String[] args) {
        Person p = new Person("Swati", 22);
        System.out.println(p.toString());
    }
}
