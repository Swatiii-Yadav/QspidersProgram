package patternProgram;

public class Print01inSolidSquare {
    public static void main(String[] args) {
        int n=5;
        int count=2;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i%2!=0) {
                    System.out.print(j % 2 + " ");
                }
                else {
                    System.out.print((j+1)%2+" ");
                }
            }

            System.out.println();
        }
    }
}
