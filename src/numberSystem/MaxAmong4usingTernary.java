package numberSystem;

public class MaxAmong4usingTernary {
    public static void main(String[] args) {
        int a=10,b=20,c=30,d=40;
        int max=((a>b && a>c)&&a>d)? a:(b>c &&b>d)? b:(c>d)? c:d;
        System.out.println(max);
    }
}
