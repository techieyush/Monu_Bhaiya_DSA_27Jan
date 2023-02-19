import java.util.*;
public class PascalTriangle {
    
   
           public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int row=0;
            int nst=0;
          
            
            while(row<num)
            {
                int i=0;
                int ncr=1;
                while(i<=nst)
                {
                    System.out.print(ncr+" ");
                    ncr=(ncr*(row-i))/(i+1);
                    i++;
                }
                row++;
                nst++;
             
                System.out.println();
            }
    
        }
    }
