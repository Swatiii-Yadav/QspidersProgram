
package exceptionHandling.march2;


class AgeNotValidException extends Exception{
    AgeNotValidException(String msg){
        super(msg);
    }
}
public class AgeValidation {
    int age;
    AgeValidation(int age){
        this.age=age;
    }
     void enterAge() throws AgeNotValidException{
        if (age<18){
           throw new AgeNotValidException("Age is Not Valid");
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
       AgeValidation a=new AgeValidation(11);
       try {
           a.enterAge();
       }catch (AgeNotValidException e){
           System.out.println("Enter valid age.");
       }

    }
}
