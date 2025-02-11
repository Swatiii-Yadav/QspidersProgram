package JavaProgram.oops.methodOverriding;

public class FaceBook {
    void reaction(){
        System.out.println("Like");
    }
}
 class FaceBookNew extends FaceBook
 {
     @Override
    void reaction(){
        System.out.println("Like\t love\t sad\t angry\t wow\t  ");
    }
}
class MainClassForFaceBook{
    public static void main(String[] args) {
        FaceBook fbOld=new FaceBook();
        fbOld.reaction();

        FaceBookNew fbNew=new FaceBookNew();
        fbNew.reaction();


        FaceBook fb=new FaceBookNew();
        fb.reaction();
    }
}
