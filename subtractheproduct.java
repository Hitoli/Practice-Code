import java.util.Scanner;

public class subtractheproduct {
    public static void main(String[] args) {
        System.out.println("please Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int result=0;
        while(n!=0){
            a =n%10;
            b*=a;
            c+=a;
            n/=10;
        }
        result=b-c;
        System.out.println(result);




    }
}
