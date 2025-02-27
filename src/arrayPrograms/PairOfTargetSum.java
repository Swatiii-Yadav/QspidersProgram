package arrayPrograms;

import java.util.Arrays;

public class PairOfTargetSum {
   static int[] findTarget(int []arr,int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target && i!=j){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr={12,4,5,8,9,2,6};
        int []res=findTarget(arr,8);
        System.out.println(Arrays.toString(res));
    }
}
