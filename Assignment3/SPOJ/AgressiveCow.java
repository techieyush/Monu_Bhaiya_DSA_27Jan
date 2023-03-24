package SPOJ;
import java.lang.reflect.Array;
import java.util.*;

public class AgressiveCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nos=sc.nextInt();
        int noc=sc.nextInt();
        int[] stall=new int[nos];
        for(int i=0;i<stall.length;i++)
        {
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        public static int minDist(int[] stall,int noc)
        {
            int low=stall[0];
            int high=stall[stall.length-1];
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(isitPossible(stall,noc,mid)==true)
                {
                    and=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return ans;

        }


    public static boolean isitPossible(int[] stall,int noc,int mid)
    {
        int pos=stall[0];
        int cowCount=1;
        for(int i=1;i<stall.length;i++)
        {
            if(stall[i]-pos>=mid)
            {
                cowCount++;
                pos=stall[i];
            }
            if(cowCount==noc)
            {
                return true;
            }
        }
       
        return false;
    }

    }
    
}
