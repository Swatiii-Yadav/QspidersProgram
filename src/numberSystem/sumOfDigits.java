package numberSystem;

public class sumOfDigits {
    public static void main(String[] args) {
        int num=2345;
        int rem=0,sum=0;
        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;

        }
        System.out.println(sum);

    }
}
