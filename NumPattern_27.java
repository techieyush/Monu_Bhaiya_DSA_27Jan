import java.util.Scanner;

public class NumPattern_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=1;
        int space=num-1;
        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            int val=1;
            while(j<=nst)
            {
                System.out.print(val+" ");
                if(j<=nst/2)
                {
                    val++;
                }
                else{
                    val--;
                }
                j++;
                
            }

            System.out.println();
            row++;
            nst+=2;
            space--;


        }
    }
    
}
