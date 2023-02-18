import java.util.Scanner;

public class NumPattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        int row=1;
        int val=1;
        int nst=1;
        int space=num-1;
        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" \t ");
                i++;
            }
            int j=1;
            int count=1;
            while(j<=nst)
            {
                System.out.print(count+" \t");
                count++;
                j++;
            }

            System.out.println();
            row++;
            nst+=2;
            space--;


        }
    }
    
}
