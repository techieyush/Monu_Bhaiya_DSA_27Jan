import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=num/2+1;
        int space=-1;
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
             if(row==num)
             {
                k=2;
             }
             while(k<=nst)
             {
                System.out.print("* ");
                k++;
             }
             if(row<=num/2)
             {
                nst--;
                space+=2;
            }
            else{
                nst++;
                space-=2;

            }
            row++;
            System.out.println();
        }
    }
    
}
