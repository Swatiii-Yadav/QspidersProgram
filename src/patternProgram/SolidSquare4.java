package patternProgram;

public class SolidSquare4 {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print(i%2+" ");
            }
            System.out.println();
        }
    }
}
