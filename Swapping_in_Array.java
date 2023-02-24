import java.util.*;
public class Swapping_in_Array {

    public static void swap(int nums[] ,int i,int j)
    {
        // int left=0;
        // int right=nums.length-1;
        // int temp=nums[left];
        // nums[left++]=nums[right];
        // nums[right--]=temp;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void print(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        swap(nums,0,1);
        print(nums);
    }
    
}
