import java.util.*;
public class PatternNumberLadder {


    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=row;
        int val=1;
        while(row<=num)
        {
            int i=1;
           
            while(i<=nst)
            {
                System.out.print(val+" ");
                val++;
                i++;
            }
            System.out.println(" ");
            row++;
          
            nst++;
        }
    }
}


    

