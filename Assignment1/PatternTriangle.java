import java.util.*;
public class PatternTriangle {
 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int space=num-1;
        int nst=1;
        int val=1;
      

        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
           
            int p=row;
            while(p<=val)
            {
                System.out.print(p+" ");
                p++;
            }
            p -= 2;
            while(p >= row)
            {
                System.out.print(p + " ");
                p--;
            }
            // while(j<=nst)
            // {
            //      System.out.print(p+" ");
            //      if(p<val)
            //      {
            //          p++;
            //      }
            //      else{
            //          p--;
            //      }
            //      j++;
              
                 
            // }
                row++;
                nst+=2;
                space--;
                val += 2;;

               
           
            System.out.println();
        }

    }
}
    

