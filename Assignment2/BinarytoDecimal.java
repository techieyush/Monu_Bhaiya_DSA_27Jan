import java.util.*;
import java.lang.Math.*;
public class BinarytoDecimal {
   


    public static int binarytoDecimal(int num)
    {
        int sum=0;
        int i=0;
        while(num>0)
        {
            int rem=num%2;
            sum+=(int)(rem*Math.pow(2,i++));
            num=num/10;
        }
        return sum;
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(binarytoDecimal(num));

    }
}
    

