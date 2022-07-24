import java.util.Scanner;

public class facotrial {
    public static void main(String[] args) {
        System.out.println("please Enter the numbers:");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int no = fact(n);
        System.out.println(no);
    }
    static int fact( int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact= fact*i;
        }
        return fact;
    }
}
