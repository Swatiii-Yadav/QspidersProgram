package patternProgram;

public class Triangle4 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k = 0; k < n-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
