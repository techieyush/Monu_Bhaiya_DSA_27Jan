import java.util.Scanner;
public class Max_Array {


    // public static int maxEleemnt(int nums[])
    // {
    //     int max=nums[0];
    //     for(int i=1;i<nums.length;i++)
    //     {
    //         if(nums[i]>max)
    //         {
    //             max=nums[i];
    //         }
        
    //     }
    //     return max;
    // }

    
    public static int maxEleemnt(int nums[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            // if(nums[i]>max)
            // {
            //     max=nums[i];
            // }
        max=Math.max(nums[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        
      


        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println(maxEleemnt(nums));
    
}
}
