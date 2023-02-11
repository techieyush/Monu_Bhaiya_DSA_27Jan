import java.util.*;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=num;
        int space=0;
        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
             int j=1;
             while(j<=nst)
             {
                System.out.print("* ");
                j++;
             }
             row++;
             System.out.println(" ");
             space=space+2;
             nst--;


        }

    }
    
}
