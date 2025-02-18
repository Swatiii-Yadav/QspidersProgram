package arrayPrograms;

public class PrintEvenElement {
    public static void main(String[] args) {
        int []arr={16,15,20,27};
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
