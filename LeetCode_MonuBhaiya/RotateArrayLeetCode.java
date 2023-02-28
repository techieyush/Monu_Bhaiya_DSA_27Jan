import java.util.Scanner;

public class RotateArrayLeetCode {
 

    public static void rotate(int[] nums,int k)
    {
        int n=nums.length;
       
         k=k%n;
         reverse(nums, 0, n-k-1);
         reverse(nums, n-k, n-1);
         reverse(nums, 0, n-1);
       
        // for(int j=1;j<=k;j++)
        // {
        //     int item=nums[n-1];
        //     for(int i=nums.length-2;i>=0;i--)
        //     {
        //         nums[i+1]=nums[i];
        //     }
        //     nums[0]=item;
       

        // }
    }
    public static void reverse(int[] nums,int left,int right) 
    {
        int n=nums.length;
       
       
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
        int[] nums=new int[size];
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(nums,k);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    
}

    
}
