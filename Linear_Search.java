import java.util.Scanner;

public class Linear_Search {

    public static int linearSearch(int[] nums,int elment)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==elment)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
      


        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int element=sc.nextInt();
        System.out.println(linearSearch(nums,element));
    }
    
}
