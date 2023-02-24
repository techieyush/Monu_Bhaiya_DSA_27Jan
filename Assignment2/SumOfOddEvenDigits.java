import java.util.*;
public class SumOfOddEvenDigits {

    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int oddDigit=0;
        int evenDigit=0;
        int count=0;
        while(num!=0)
        {
            int lastDigit=num%10;
            if(count%2!=0)
            {
               oddDigit+=lastDigit;
            }
            else{
                 evenDigit+=lastDigit;
            }
            
            num=num/10;
          
            count++;

        }
        System.out.println(evenDigit);
        
        System.out.println(oddDigit);
       

        

    }
}

