package JavaProgram.oops.polymorphism;

public class FaceBook {
    void display(){

    }
}
 class FaceBookMobile extends FaceBook {
    @Override
    void display(){
        System.out.println("Display in mobile");
    }
}
 class FaceBookWebsite extends FaceBook {
    @Override
    void display(){
        System.out.println("Display in Website");

    }
}
