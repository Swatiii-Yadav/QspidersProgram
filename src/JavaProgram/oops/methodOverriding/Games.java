package JavaProgram.oops.methodOverriding;

import JavaProgram.oops.costructors.Game;

public class Games {
    void play(){
        System.out.println("PUBG");
    }
}
 class Sample extends Games {
    @Override
    void play(){
        System.out.println("BGMI");
    }
}
