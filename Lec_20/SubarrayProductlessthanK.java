// package Lec_20;

import java.util.Scanner;

public class SubarrayProductlessthanK {

    public static int subArrayProd(int nums[],int k)

    {
        if(k<=1)
        {
            return 0;
        }

        int start=0;
        int end=0;
        int prod=1;
        int ans=0;
        while(end<nums.length)
        {
            //growing
            prod*=nums[end];
            //Shrinking
            while(prod>=k && start<=end)
            {
                prod=prod/nums[start];
                start++;

            }
            ans+=(end-start+1);
            end++;
        }
        return end;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(subArrayProd(nums, k));
    }
    
}
