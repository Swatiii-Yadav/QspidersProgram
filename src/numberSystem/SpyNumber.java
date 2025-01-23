package numberSystem;

/*WAP check the given number is spy number or not*/
/*if the sum of all digits is equal to  product of digits eg 22,2+2=4,2*2=4
 * */
public class SpyNumber {
    public static void main(String[] args) {
        int num = 122;
        int sum = 0, prod = 1;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            sum += rem;
            temp = temp / 10;
        }
        System.out.println(sum);
        while (num > 0) {
            int rem = num % 10;
            prod *= rem;
            num = num / 10;
        }
        System.out.println(prod);
        if (sum == prod) {
            System.out.println("spy number");
        } else {
            System.out.println("Not a spy number");
        }
    }
}
