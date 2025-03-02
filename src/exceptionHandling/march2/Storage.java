package exceptionHandling.march2;

class InSufficientStorageException extends Exception{
    InSufficientStorageException(String msg){
        super(msg);
    }
}
public class Storage {
    int space;
   Storage(int space){
        this.space=space;
    }
    void Add(double data)  throws  InSufficientStorageException{

        if (data > space) {
            throw new InSufficientStorageException("Storage is full");
        }
        space+= (int) data;
    }

}
class MainClassForStorage{
    public static void main(String[] args) {
        Storage s1=new Storage(2);//space in gb
        try {
            s1.Add(2.1);
        } catch (InSufficientStorageException e) {
            System.out.println(e.getMessage());
        }

    }
}
