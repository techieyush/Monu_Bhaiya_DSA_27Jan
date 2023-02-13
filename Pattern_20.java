import java.util.*;
public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row=1;
        int space1=num/2;
        int space2=-1;
        while(row<=num){
            int i=1;
            while(i<=space1)
            {
                System.out.print("  ");
                i++;
            }
        
                System.out.print("* ");
        

            int j=1;
            while(j<=space2)
            {
                System.out.print("  ");
                j++;
            }
            
            if(row>=2 && row<num)
            {
                System.out.print("* ");
            }
           

            if(row<=num/2)
            {
                space1--;
                space2=+2;
            }
            else{
                space1++;
                space2-=2;
            }

            row++;
            System.out.println();

        }
      

        
    }
    
}
