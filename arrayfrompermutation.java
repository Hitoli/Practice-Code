import java.util.Arrays;
import java.util.Scanner;

public class arrayfrompermutation {
    public static void main(String[] args) {
        System.out.println("please Enter the array:");
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        int [] nums = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<arr.length; i++){

            nums[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(nums));
    }
}
