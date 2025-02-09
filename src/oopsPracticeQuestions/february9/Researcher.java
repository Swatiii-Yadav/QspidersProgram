package oopsPracticeQuestions.february9;

public interface Researcher {

    default void researcher(){}
}
class Professor extends  Teacher implements  Researcher{

    Professor(String name, int id, String subject) {
        super(name, id, subject);
    }

    @Override
    public void researcher() {
        System.out.println("doingresearch...");
    }
    @Override
    void teach(){
        System.out.println("teaching.....");
    }
    void giveLecture(){
        System.out.println("giving lecture.....");

    }
}