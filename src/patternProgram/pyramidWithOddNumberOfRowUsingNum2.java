package patternProgram;

public class pyramidWithOddNumberOfRowUsingNum2 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i+(i-1);k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
