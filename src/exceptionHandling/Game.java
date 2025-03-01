package exceptionHandling;

public class Game {
    int highScore=1000;
    public static void main(String[] args) {
        Game org=new Game();
        org.highScore=5000;
        //checked exception handling
        try {
            Game copy=(Game)org.clone();
            System.out.println(copy.highScore);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone operation failed");
        }
    }
}
