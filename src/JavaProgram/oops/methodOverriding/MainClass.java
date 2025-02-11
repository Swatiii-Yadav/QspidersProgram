package JavaProgram.oops.methodOverriding;

import JavaProgram.oops.costructors.Game;

public  class MainClass extends Games{
    public static void main(String[] args) {
        Games g1=new Games();
        g1.play();

        Sample s1=new Sample();
        s1.play();

        Games ref=new Sample();
        ref.play();
    }
}
