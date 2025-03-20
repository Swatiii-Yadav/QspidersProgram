package JavaProgram.objectClass;

public class Photo implements Cloneable {
    int size=0;

    public static void main(String[] args)throws CloneNotSupportedException {
       Photo photo =new Photo();
       photo.size=12;
       Photo copy=(Photo)photo.clone();
        System.out.println(copy.size);
    }
}
