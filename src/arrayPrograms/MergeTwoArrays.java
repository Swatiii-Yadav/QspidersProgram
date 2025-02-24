package arrayPrograms;

public class MergeTwoArrays
{
    public static void main(String[] args) {
        int [] arr1={1,4,6,7};
        int [] arr2={2,3,5,8};
        int[] res=new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
         res[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            res[arr1.length+ i]=arr2[i];
        }
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
