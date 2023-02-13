import java.util.Scanner;

public class NumPattern_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int space1=num-1;
        int val=1;
        int nst=1;
        while(row<=2*num-1)
        {
            int i=1;
            while(i<=space1)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            int p=val;
            while(j<=nst)
            {
                System.out.print(p+" ");
                if(p<=nst/2)
                {
                    p++;
                }
                else{
                    p--;    
                }
                j++;
            }
            if(row<num)
            {
                nst+=2;
                space1--;
                val++;
            }else{
                nst-=2;
                space1++;
                val--;
            }
            row++;
            System.out.println();
        }

    }
    
}
