package collection.intro;
 class Book{

}
class pen{

}
public class ObjClass {
    public static void main(String[] args) {
        Object[] arr=new Object[5];
        arr[0]=new pen();
        arr[1]=new pen();
        arr[2]=new Book();
        arr[3]=new Book();
        arr[4]="core java";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
