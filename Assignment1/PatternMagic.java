import java.util.*;

public class PatternMagic {
    
   
        public static void main (String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=num;
            int space=-1;
            while(row<=2*num-1)
            {
                if(row == 1 || row == 2*num-1)
                {
                    int st = 1;
                    while(st <= 2*num-1)
                    {
                    System.out.print("*");
                    st++;
                    }
                }
                else{
            
                int i=1;
                // if(i==1)
                // {
                //     i=2;
    
                // }
                while(i<=nst)
                {
                    System.out.print("*");
                    i++;
                }
                int j=1;
                while(j<=space)
                {
                    System.out.print(" ");
                    j++;
                }
                int k=1;
                // if(row==num)
                // {
                //     k=2;
                // }
                while(k<=nst)
                {
                    System.out.print("*");
                    k++;
                }
                }
                if(row<num)
                {
                   nst--;
                  space+=2;
                }
                else
                {
                 space-=2;
                 nst++;  
                }
                
                row++;
               
               System.out.println();
            }
    
        }
    }
