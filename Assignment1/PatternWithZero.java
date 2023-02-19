import java.util.*;
public class PatternWithZero {
    
   
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            while(row<=num)
            {
                int i=1;
                while(i<=nst)
                {
                    if(i==1 || i==row)
                    {
                        System.out.print(row+" ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                    i++;
                }
                row++;
                nst++;
                System.out.println();
              
            }
    
        }
    }
