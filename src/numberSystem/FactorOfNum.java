package numberSystem;

public class FactorOfNum
{
    public static void main(String[] args) {
        int num=100;
        for (int i = 1; i <=num/2 ; i++) {
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(num);
    }
}
