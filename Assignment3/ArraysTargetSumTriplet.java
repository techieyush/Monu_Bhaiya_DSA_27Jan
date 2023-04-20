import java.util.*;
public class ArraysTargetSumTriplet {
    
   



    public static void sumTriplet(int [] nums,int target)
    {
        Arrays.sort(nums);
        int i,j,k;
       
        for( i=0;i<nums.length-2;i++)
        {
           j=i+1;
           k=nums.length-1;
           while(j<k)
            {
               if(nums[i]+nums[j]+nums[k]==target)
               {
                   System.out.println(nums[i]+", "+nums[j]+" and "+nums[k]);
                   j++;
                   k--;
               }
               else if(nums[i]+nums[j]+nums[k]>target)
               {
                   k--;
               }
               else{
                   j++;
               }
                        
                        
                     
                    
            }
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
        int target=sc.nextInt();
        sumTriplet(nums,target);

    }
}

