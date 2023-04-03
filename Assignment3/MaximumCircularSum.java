import java.util.*;

public class MaximumCircularSum {
   


    public static int maximumSum(int nums[])
    {
         int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
         sum+=nums[i];
         ans=Math.max(ans,sum);
         if(sum<0)
         {
             sum=0;
         }    
        }
      int totalSum=0;
      
      int sum2=0;
      int ans2=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
          totalSum+=nums[i];
          nums[i]*=-1;
          sum2+=nums[i];
         ans2=Math.max(ans2,sum2);
         if(sum2<0)
         {
             sum2=0;
         }    

      }
     

       ans2=Math.max(ans,totalSum+ans2);
       return ans2;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-->0)
        {
            int size=sc.nextInt();
            int nums[]=new int[size];
            for(int i=0;i<size;i++)
            {
                nums[i]=sc.nextInt();
            }
           System.out.println(maximumSum(nums)); 
        }

    }
}
    

 