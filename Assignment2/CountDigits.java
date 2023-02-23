import java.util.*;
public class CountDigits{
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int val=sc.nextInt();
        int count=0;
        while(num!=0)
        {
            int lastDigit=num%10;
            if(lastDigit==val)
            {
                count++;
            }
            num=num/10;

       }
       System.out.println(count);
        
     

    }
}
     
