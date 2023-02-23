import java.util.*;
public class OddEveninDehi {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-->0)
        {
            int num=sc.nextInt();
            int lastDigit=0;
            int evenSum=0;
            int oddSum=0;
            while(num!=0)
            {
                lastDigit=num%10;
                if(lastDigit%2==0)
                {
                    evenSum+=lastDigit;
                }
                else
                {
                    oddSum+=lastDigit;
                }
                num=num/10;
            }
            if(evenSum%4==0 || oddSum%3==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
    

