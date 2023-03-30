import java.util.*;
public class TrappingRainwater {

    public static int waterTrap(int [] nums)
    {
        int sum=0;
        int n=nums.length;
        int [] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],nums[i]);
        }
        int [] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(left[i],right[i])-nums[i];
        }

        return sum;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(waterTrap(nums));
    }
    
}
