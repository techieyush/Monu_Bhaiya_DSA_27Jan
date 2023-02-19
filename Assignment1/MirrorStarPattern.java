import java.util.*;
public class MirrorStarPattern {
   

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=1;
        int space=num/2;
        int val=1;
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
                if(row<num/2+1)
                {
                    space--;
                    nst+=2;
                    val++;
                }
                else{
                    space++;
                    nst-=2;
                    val--;
                }
                row++;
                System.out.println();
            }
        
        
    }
}

    

