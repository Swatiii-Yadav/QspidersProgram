package numberSystem;

public class countDigitsInNum {
    public static void main(String[] args) {
        int rem=0,count=0,num=234;
        while (num>0){
            rem=num%10;
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
