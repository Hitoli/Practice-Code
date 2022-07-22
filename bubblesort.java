import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,5,4,7,0};
        System.out.println(Arrays.toString(bubblesor(arr)));
    }
    static int[] bubblesor(int[]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<=arr.length-1; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
