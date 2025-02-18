package arrayPrograms;

public class SumOfOddNum {
    public static void main(String[] args) {
        int []arr={16,15,20,27};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
               sum+=arr[i];
            }
        }
        System.out.print(sum +" ");
    }
}

