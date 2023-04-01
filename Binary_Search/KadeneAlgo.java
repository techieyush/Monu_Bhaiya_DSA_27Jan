// package Binary_Search;

public class KadeneAlgo {
    public static int kadene(int[] nums)
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-7,11,-1,3};
        System.out.println(kadene(nums));
    }
    
    
}
