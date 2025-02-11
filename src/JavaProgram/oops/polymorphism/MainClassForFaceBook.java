package JavaProgram.oops.polymorphism;

public class MainClassForFaceBook {
    public static void main(String[] args) {
        //tightly coupled
        FaceBook fb;
        fb=new FaceBookMobile();
        fb.display();
        fb=new FaceBookWebsite();
        fb.display();

        //loosely coupled
        FaceBookDisplayAdapter.adapt(new FaceBookMobile());
        FaceBookDisplayAdapter.adapt(new FaceBookWebsite());

    }
}
