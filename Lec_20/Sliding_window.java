// package Lec_20;

import java.util.Scanner;

public class Sliding_window {

    public static int slidingWindow(int[] nums,int k)
    {
        int sum=0;
        int ans=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        ans=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i];//window grow
            sum-=nums[i-k];//window shrink 
            ans=Math.max(sum,ans);//answer update

        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();

        }
        int k=sc.nextInt();
        System.out.println(slidingWindow(nums,k));
    }
    
}
