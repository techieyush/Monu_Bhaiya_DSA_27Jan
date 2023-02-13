import java.util.Scanner;

public class Pattern_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=num;
        while(row<=num)
        {
            int i=1;
            while(i<=nst)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println("");
        }

        // int num=sc.nextInt();
        // int row=1;
        // int nst=num;
        // while(row<=num)
        // {
        //     int i=1;
        //     while(i<=nst)
        //     {
        //         System.out.print("* ");
        //         i++;
        //     }
        //     row++;
        //     System.out.println("");
           
        // }
    }
    
}
