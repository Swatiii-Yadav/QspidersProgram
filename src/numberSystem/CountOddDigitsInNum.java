package numberSystem;

public class CountOddDigitsInNum {
    public static void main(String[] args) {
        int num=3452198,count=0;
        while (num>0){
            int rem=num%10;
            if (rem%2!=0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
