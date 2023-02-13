import java.util.*;
public class Pattern_22 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int space=0;
        int nst=num;
        while(row<=num)
        {
            int i=1;
            if(row==1)
            {
                i=2;
            }
            while(i<=nst)
            {
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
              int k=1;
            //  if(row==num)
            //  {
            //     k=2;
            //  }
            while(k<=nst)
            {
              System.out.print("* ");
               k++;
            }
            System.out.println();
            row++;
            nst--;
            space=2*row-3;

        }

    }
    
}

    

