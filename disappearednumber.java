import java.util.ArrayList;
import java.util.List;

public class disappearednumber {
    public static void main(String[] args) {
        int []arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer>list = new ArrayList<Integer>();
        missNumber(arr,list);
        System.out.println(list);

    }
    static void missNumber(int []arr,ArrayList<Integer>list){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]<=arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);

            }else{
                i++;

            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }


    }
    static int[] swap(int []arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
