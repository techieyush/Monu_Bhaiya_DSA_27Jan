import java.util.*;
public class SortZerosAndOnes {
  


    public static void sort(int[] nums)
     {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count++;
            }
           
        }
        for(int i=0;i<count;i++)
        {
            nums[i]=0;
        }
        for(int i=count;i<nums.length;i++)
        {
            nums[i]=1;
        }
         nums[i]=2;
        }

        // System.out.println(count);
        // int left=0;
        // int right=nums.length-1;
        // while(left<right)
        // {
        //     if(nums[left]>nums[right])
        //     {
        //         left++;
        //     }
        //     else{
        //         int temp=nums[left];
        //         nums[left]=nums[right];
        //         nums[right]=temp;
        //         right--;
        //     }
        // }
       
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        

    }
}
    

