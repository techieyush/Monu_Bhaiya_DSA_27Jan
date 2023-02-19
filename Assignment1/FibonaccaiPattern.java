
import java.util.*;
public class FibonaccaiPattern {
    
  
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            int a=0;
            int b=1;
            while(row<=num)
            {
                int i=1;
                while(i<=nst)
                {
                    System.out.print(a+" ");
                    int c=a+b;
                    a=b;
                    b=c;
                    i++;
    
                }
                row++;
                nst++;
                System.out.println();
            }
    
    
        }
    }
