package StringLec_2;

import java.util.Scanner;

public class CBNumber {


    public static int convertSub(String str)

    {
        int count=0;
        int len=str.length();
        for(int length=1;length<=len;length++)
        {
            for(int i=length;i<=len;i++)
            {
                int j=length-i;
               String s1=str.substring(i, j);
               long n=Long.parseLong(s1);
               if(IsCbNumber(n)==true)
               {
                count++;
               }
            }
        }
        return count;
    }

    public static boolean IsCbNumber(long num)
    {
        if(num==0 || num==1)
        {
            return false;
        }
        int [] arr={2,3,5,7,9,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                return true;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                return true;
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
    }
    
}
