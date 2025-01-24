package JavaProgram.oops.Inheritance;

public class InstagramOld {
    void post(){
        System.out.println("Posting.....");
    }
}
class InstagramNew extends InstagramOld {
    void messenger(){
        System.out.println("Messaging....");
    }
}
class Mainclass2{
    public static void main(String[] args) {
        InstagramOld i1=new InstagramOld();
        i1.post();
        InstagramNew i2=new InstagramNew();
        i2.post();
        i2.messenger();
    }
}