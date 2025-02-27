package arrayPrograms;

public class PairOfTargetSumApp2
{
    public static void main(String[] args) {
        int [] arr={12,4,5,8,9,2,6};
        int target=8;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target && i!=j){
                    System.out.println("index of target sum "+i+" , "+j+" ");

                }
            }
        }
    }
}
