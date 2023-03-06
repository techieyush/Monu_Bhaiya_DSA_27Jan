import java.util.*;
public class SelectionSort {



    public static void selectionSort(int [] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int min=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]<nums[min])
                {
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;

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
        selectionSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+" ");
        }

    }
}
    

