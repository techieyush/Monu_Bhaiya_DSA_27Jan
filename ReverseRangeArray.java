import java.util.Scanner;
public class ReverseRangeArray {
   



    public static void reverse(int[] nums,int a,int b)
    {
      
       while(a<b)
       {
        int temp=nums[a];
        nums[a++]=nums[b];
        nums[b--]=temp;
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
        int range1=sc.nextInt();
        int range2=sc.nextInt();
        reverse(nums,range1,range2);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
       
    }
    
}

    

