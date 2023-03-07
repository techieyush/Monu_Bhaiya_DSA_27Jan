import java.util.*;
public class LinearSorting {

    



    public static void sortArray(int[] nums)
    {
        int n= nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
           if(nums[mid]==0)
           {
               swap(nums,low,mid);
               mid++;
               low++;
           } 
           else if(nums[mid]==1)
           {
               mid++;
           }
           else{
               swap(nums,mid,high);
               high--;
           }
        
        }
}
 public static void swap(int[] nums,int left,int right)
 {
     int temp=nums[left];
     nums[left]=nums[right];
     nums[right]=temp;
 }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        sortArray(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    
    
    
    
    }
}
