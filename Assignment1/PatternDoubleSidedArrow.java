import java.util.*;
public class PatternDoubleSidedArrow {
    

    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            int space=num-1;
            int space2=-1;
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
                int p=val;
                while(j<=nst)
                {
                    System.out.print(p+" ");
                    j++;
                    p--;
                }
                int k=1;
                while(k<=space2)
                {
                    System.out.print("  ");
                    k++;
                }
                int l=1;
                p=1;
                if(row==1 || row==num)
                {
                    l=2;
                }
                while(l<=nst)
                {
                    System.out.print(p+" ");
                    l++;
                    p++;
                }
                if(row<=num/2)
                {
                    space-=2;
                    nst++;
                    space2+=2;
                    val++;
                }
                else{
                    space+=2;
                    nst--;
                    space2-=2;
                    val--;
                }
                row++;
                System.out.println();
                
            }
    
        }
    }
