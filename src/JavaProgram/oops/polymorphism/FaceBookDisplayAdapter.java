package JavaProgram.oops.polymorphism;
//service layer
public class FaceBookDisplayAdapter {
    static void adapt(FaceBook fb){
        if (fb!=null){
            fb.display();
        }
    }
}
