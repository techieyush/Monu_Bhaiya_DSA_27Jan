import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=1;
        while(row<=num)
        {
            int i=1;
            while(i<=nst)
            {
                System.out.print("* ");
                i++;
            }
            System.out.println(" ");
            row++;
            nst++;
        }

    }
    
}
