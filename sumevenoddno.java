import java.util.Scanner;

public class sumevenoddno {
    public static void main(String[] args) {
        System.out.println("please Enter the numbers");
        Scanner in = new Scanner(System.in);
        int n=1;
        int a = 0,b=0,c=0;
        while(n!=0){
            n = in.nextInt();
            if(n%2==0 && n>0){
               a+=n; 
            }else if(n<0){
                b+=n;
            }else if(n%2!=0){
                c+=n;
            }
            if(n==0){
                break;
            }
        }
        System.out.println("Sum of Negative:"+b);
        System.out.println("Sum of Even Numbers:"+a);
        System.out.println("Sum of Odd Numbers:"+c);
        
    }
}
