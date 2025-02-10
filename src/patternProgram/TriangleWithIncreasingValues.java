package patternProgram;

public class TriangleWithIncreasingValues {
    public static void main(String[] args) {
        int x=1;
        int n=5;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++) {
                System.out.printf("%3d",x);
                x++;
            }
            System.out.println();
        }
    }
}
