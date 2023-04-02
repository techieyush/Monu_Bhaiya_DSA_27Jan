import java.util.*;
public class AlexShoping {
    

    public static void findItem(int nums[],int money,int item)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(money%nums[i]==0)
            {
                count++;
            }
        }
        if(count>=item)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
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
        int queries=sc.nextInt();
        int money;
        int item;
        while(queries!=0)
        {
             money=sc.nextInt();
             item=sc.nextInt();
             findItem(nums, money, item);
             queries--;
        }
       
    }
   
}
    

