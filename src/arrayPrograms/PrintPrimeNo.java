package arrayPrograms;

public class PrintPrimeNo {
    static boolean checkPrimeNo(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<=num/2;i++){
            if (num%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 13, 15, 17, 20};
       for (int i=0;i<arr.length;i++){
           if (checkPrimeNo(arr[i])){
               System.out.print(arr[i]+" ");
           }
       }
    }
}
