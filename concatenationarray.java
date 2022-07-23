import java.util.Arrays;
import java.util.Scanner;

public class concatenationarray {
    public static void main(String[] args) {
        System.out.println("please Enter the Numbers:");
        Scanner in = new Scanner(System.in);
        int [] arr = new int[3];
        int [] ans = new int[2*arr.length];
        for(int i=0; i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<arr.length; i++){
           ans[i]= arr[i];
           ans[i+3]=arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
