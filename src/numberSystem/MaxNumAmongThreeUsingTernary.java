package numberSystem;

public class MaxNumAmongThreeUsingTernary {
    public static void main(String[] args) {
        int num1=89,num2=67,num3=24;
        int max,result;
        max=(num1>num2 && num1>num3)?num1:(num2>num3)?num2:num3;

        System.out.println(max);
    }
}
