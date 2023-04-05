import java.util.*;

public class FindMajorityElements {

    public static void majorityElement(int[] nums)
    {
        int maxCount=0;
        int index=-1;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                index=i;
            }
        }
        if(maxCount>=nums.length/3)
        {
            System.out.println(nums[index]+" ");
        }
       else{
        System.out.println("-1");
       }
    }

    public static void main(String[] args) {
       int nums[]={2 ,2, 3, 1, 3, 2 , 1, 1 };
    //    System.out.println(majorityElement(nums));
        majorityElement(nums);



    }
    
}
