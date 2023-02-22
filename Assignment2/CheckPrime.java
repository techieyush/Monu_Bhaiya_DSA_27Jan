import java.util.*;
public class CheckPrime {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag++;
            }
        }
        if(flag>=1)
        {
            System.out.println("Not Prime");

        }
        else{
             System.out.println("Prime");
        }
    }
}
    

