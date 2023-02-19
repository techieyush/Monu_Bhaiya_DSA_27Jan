import java.util.*;
public class HollowRhombusPattern {
 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=num;
        int space=num-1;
        while(row<=num)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print(" ");
                j++;
            }
            if(row==1 || row==num)
            {
             int i=1;
             while(i<=nst)
            {
                System.out.print("*");
                i++;
            }
            }
             else{
                 System.out.print("*");
                 int i=1;
                 while(i<=num-2)
                 {
                     System.out.print(" ");
                     i++;
                 }
                 System.out.print("*");
             }
            row++;
            space--;
            System.out.println();

        }

    }
}
    

