import java.util.*;
public class ReplacethemAll {



   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num=sc.nextLong();
        long number=0;
        if(num==0)
        {
            num=5;
        }
      
        long count=0;
        while(num!=0)
        {
            long lastDigit=num%10;
            if(lastDigit==0)
            {
               number+=5*(long)Math.pow(10,count);
            }
            else{
                number+=lastDigit*(long)Math.pow(10,count);
            }
            num=num/10;
            count++;

        }
        System.out.println(number);
        

    }
}
    

