// package Lec_20;
import java.util.*;


public class KartikBhiayAndString {

    public static int maximumLength(String str,char ch,int k)
    {
        int start=0;
        int end=0;
        int ans=0;
        int flip=0;

        while(end<str.length())
        {
            if(str.charAt(end)==ch)
            {
                flip++;

            }
            while(flip>k && start<=end)
            {
                if(str.charAt(start)==ch)
                {
                    flip--;
                }
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        String str=sc.next();
        int flip_a=maximumLength(str, 'a', k);
        int flip_b=maximumLength(str, 'b', k);
        System.out.println(Math.max(flip_a,flip_b));
    }
    
}
