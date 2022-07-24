import java.util.ArrayList;
import java.util.List;

public class findallduplicate {
    public static void main(String[] args) {
        int []arr= {4,3,2,7,8,2,3,1};
        ArrayList<Integer>arrs = new ArrayList<>();
        System.out.println(duplicatenums(arr,arrs));

    }
    static List<Integer> duplicatenums(int[]arr, ArrayList<Integer>arrs){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=j+1){
                arrs.add(arr[j]);
            }
        }
        return arrs;
    }
    static int[] swap(int []arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
