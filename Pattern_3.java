import java.util.*;
public class Pattern_3 {
   
      
    
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            int space=num-1;
            while(row<=num)
            {
               //space
                int i=1;
                while(i<=space)
                {
                    System.out.print("  ");
                    i++;
                }
                //stars
                int j=1;
                while(j<=nst)
                {
                    System.out.print("* ");
                    j++;
                }

               
                row++;
                System.out.println(" ");
                space--;
                nst++;
            }
    
        }
    }
    

