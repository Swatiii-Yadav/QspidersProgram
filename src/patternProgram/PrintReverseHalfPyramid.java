package patternProgram;

public class PrintReverseHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int j = i+1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
