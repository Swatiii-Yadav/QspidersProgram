package patternProgram;

public class SolidSquare5 {
    public static void main(String[] args) {
        int n=5;
        int m=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }
}
