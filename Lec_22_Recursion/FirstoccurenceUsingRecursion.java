// package Lec_22_Recursion;

public class FirstoccurenceUsingRecursion {

    public static int findIndex(int[] nums,int i,int item)
    {
        if(i==nums.length)
        {
            return -1;
        }
        if(nums[i]==item)
        {
            return i;
        }
       
        return findIndex(nums,i+1,item);
        
    }
    public static void main(String[] args) {
        // int nums[]={2,13,7,5,3,4,5,6,3,9,3};
        int nums[]={1,2,3,4};
        int item=5;
        System.out.println(findIndex(nums, 0, 5));
    }
    
}
