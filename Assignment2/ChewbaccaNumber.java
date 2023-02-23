import java.util.*;
public class ChewbaccaNumber {

    

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        
        while(num!=0)
        {
            long lastDigit=num%10;
            if(lastDigit<5||lastDigit==9 )
            {
                System.out.print(lastDigit);
            }
            else{
                System.out.print((9-lastDigit));
            }
            num=num/10;
        }
    }
}


