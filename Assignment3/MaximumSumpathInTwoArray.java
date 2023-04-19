import java.util.*;
public class MaximumSumpathInTwoArray {
   


    public static int pathSum(int nums1[],int nums2[])
    {
      int i=0;
      int j=0;
      int p1=0;
      int p2=0;
      int ans=0;
      while(i<nums1.length && j<nums2.length)
      {
          if(nums1[i]<nums2[j])
          {
              i++;
          }
          else if(nums1[i]>nums2[j]){
              j++;
          }
          else{
              int sum1=0;
              int sum2=0;
              for(int k=p1;k<=i;k++)
              {
                  sum1+=nums1[k];
              }
              for(int k=p2;k<=j;k++)
              {
                  sum2+=nums2[k];
              }
            ans+=Math.max(sum1,sum2);
                i++;
                j++;
                p1=i;
                p2=j;
              
          }
      }
          if(i==nums1.length){
              for(int k=p2;k<nums2.length;k++)
              {
                  ans+=nums2[k]; 
              }
          }
          if(j==nums2.length){
              for(int k=p1;k<nums1.length;k++)
              {
                  ans+=nums1[k]; 
              }
          }
      
      return ans;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase-->0)
        {
            int size=sc.nextInt();
            int size1=sc.nextInt();
            int nums1[]=new int[size];
            int nums2[]=new int[size1];
            for(int i=0;i<nums1.length;i++)
            {
                nums1[i]=sc.nextInt();
            }
           
            for(int i=0;i<nums2.length;i++)
            {
                nums2[i]=sc.nextInt();
            }
            
        System.out.println(pathSum(nums1,nums2));
            
        }

    }
}

