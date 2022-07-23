import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[]arr = {2,3,4,1};
        System.out.println(Arrays.toString(sort(arr)));

    }
    static int[] sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        return arr;
    }
    static int[] swap(int[]arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}
