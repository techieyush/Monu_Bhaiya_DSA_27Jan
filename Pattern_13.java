import java.util.*;
public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=1;
        while(row<=2*num-1)
        {
            int i=1;
            while(i<=nst)
            {
                System.out.print("* ");
                i++;
            }
            System.out.println("");
            row++;
            if(row<num)
            {
                nst++;
            }
            else{
                nst--;
            }
          
        }

        }

    }
    

