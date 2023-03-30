import java.util.*;
public class ProductOfArrayExceptSelf {

    public static int[] prodExceptSelf(int nums[])
    {
        int n=nums.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        int []right=new int[n];
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        { 
            right[i]=right[i+1]*nums[i+1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        
        int [] result=prodExceptSelf(nums);
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    
}
