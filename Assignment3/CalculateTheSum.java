import java.util.*;
public class CalculateTheSum {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int query=sc.nextInt();
        while(query-->0)
        {
            int x=sc.nextInt();
            int nums1[]=new int[n];
            for(int i=0;i<nums.length;i++)
            {
                int j=i-x;
                if(j<0)
                {
                    j=j+n;
                }
                nums1[i]=nums[i]+nums[j];
            }
            nums=nums1;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        System.out.println(sum);
    }
}
    

