import java.util.Scanner;

public class FibonaccaiNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=num;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            
            
        }
        System.out.print(a+" ");
       
    }
    
}
