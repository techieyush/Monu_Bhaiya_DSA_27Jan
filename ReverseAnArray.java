import java.util.Scanner;

public class ReverseAnArray {

    public static void reverse(int[] nums)
    {
       int left=0;
       int right=nums.length;
       while(left<right)
       {
        int temp=nums[left];
        nums[left++]=nums[right];
        nums[right--]=temp;
       }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
       
        reverse(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
       
    }
    
}
