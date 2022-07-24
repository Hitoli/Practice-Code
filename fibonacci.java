import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        System.out.println("please Enter the no of times");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=0; i<n; i++){
        int temp = b;
        b+=a;
        a=temp;
        }
        System.out.println(b);
    }
}
