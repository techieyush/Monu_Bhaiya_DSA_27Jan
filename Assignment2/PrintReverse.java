import java.util.*;
public class PrintReverse {
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num!=0)
        {
            int lastDigit=num%10;
            System.out.print(lastDigit);
            num=num/10;
            
        }
        // Your Code Here
    }
}

    

