import java.util.Arrays;

public class targetarray {
    public static void main(String[] args) {
        int []arr = {0,1,2,3,4};
        int []target ={0,1,2,2,1};
        int []nums = new int[5];

        for(int i=0; i<arr.length;i++){

            if(i>target[i]){

            }else{
                nums[target[i]]=arr[i];
            }


        }
        System.out.println(Arrays.toString(nums));
    }
}
