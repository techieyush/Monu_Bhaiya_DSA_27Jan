// package Binary_Search;

public class MaximumSubArray {

    public static int maxSubarray(int [] nums){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum+=nums[j];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));

        
    }
    
}
