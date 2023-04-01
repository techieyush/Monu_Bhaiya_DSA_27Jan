// package Binary_Search;

public class BinarySearch1 {

    public static int binarySearch(int nums[],int k)
    {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==k)
            {
                return mid;
            }
            if(nums[mid]>k)
            {
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,3,5,7,8,9,11,12,13,18};
        int item=13;
        System.out.println(binarySearch(nums, item));

    }

    
}
