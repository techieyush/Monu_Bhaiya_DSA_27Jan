import java.util.*;
public class NthFibonaccai {
    
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<num;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(a+" ");
        
        // Your Code Here
    }
}


