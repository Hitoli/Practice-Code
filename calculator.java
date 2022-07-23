import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
       int n=1;
        while(n!=0){
            n=0; System.out.println("please Enter the operator:");
                Scanner in = new Scanner(System.in);
                char operator = in.next().charAt(0);
                if(operator=='x'){
                    break;
                }
                System.out.println("please enter two numbers:");

                int a = in.nextInt();
                int b = in.nextInt();
                int c=0;


                switch (operator){
                    case'+'-> c=a+b;
                    case'-'-> c=a-b;
                    case'/'->c=a/b;
                    case'%'->c=a%b;
                default-> System.out.println("please Enter a valid operator");
            }
            System.out.println("ANS:"+c);

        }





    }
}
