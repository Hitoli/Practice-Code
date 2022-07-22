import java.util.Scanner;

public class amrstrong {
    public static void main(String[] args) {
        System.out.println("Please Enter the number");
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int On=n;
        int b =0;
        int a=0;
        while(n!=0){
            int no = n%10;
             a = no*no*no;
            b+=a;
            n/=10;
        }
        if(b==On){
            System.out.println("no is Armstrong number");
        }else{
            System.out.println("no is not Armstrong number");
        }

    }
}
