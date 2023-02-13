import java.util.Scanner;

public class Pattern_16 {
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int row=1;
    int nst=num;
    int space=num-1;
    while(row<=2*num-1)
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
       if(row<num)
       {
        nst--;
        space--;
       }
       else{
        nst++;
        space++;
       }
        System.out.println();
        row++;
    }
   }


    
}
