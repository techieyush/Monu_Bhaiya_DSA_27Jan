import java.util.*;
public class PatternMountain {
    
  
 
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            int space=2*num-3;
            while(row<=num)
            {
                int i=1;
                while(i<=nst)
                {
                    System.out.print(i+" ");
                    i++;
                }
                int j=1;
                while(j<=space)
                {
                    System.out.print("  ");
                    j++;
                }
                int k=row;
                if(num==row)
                {
                    k=row-1;
                }
                while(k!=0)
                {
                    System.out.print(k+" ");
                    k--;
                }
                row++;
                nst++;
                space-=2;
                System.out.println( );
            }
    
        }
    }
