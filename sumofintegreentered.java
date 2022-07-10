import java.util.Scanner;

public class sumofintegreentered {
    public static void main(String[] args) {
        System.out.println("please enter the number");
        Scanner in = new Scanner(System.in);
        int n = 1;
        int a=0;
        while(n!=0){
            n = in.nextInt();
            a+=n;
            if(n==0){
                break;
            }
        }
        System.out.println(a);
    }
}
