import java.util.*;
public class InsertionSort {
   


public static void insertionSort(int[] nums)
{
    for(int i=1;i<nums.length;i++)
    {
        int picked=nums[i];
        int j=i-1;
        while(j>=0 && nums[j]>picked)
        {
            nums[j+1]=nums[j];
            j--;
        }
        nums[j+1]=picked;
    }
}


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        insertionSort(nums);
        for(int i=0;i<nums.length;i++)
        {
           System.out.print(nums[i]+" ");
        }

    }
}
    

