import java.util.*;
public class NextPermutation {
   
   
    
        public static void reverse(int nums[],int i,int j)
        {
            while(i<j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    
        public static void arrayPermutation(int nums[])
        {
            int p=0;
            int q=0;
            for(int i=nums.length-2;i>=0;i--)
            {
                if(nums[i+1]>nums[i])
                {
                    p=i;
                    break;
                }
            }
            for(int i=nums.length-1;i>p;i--)
            {
                if(nums[i]>nums[p])
                {
                    q=i;
                    break;
                }
            }
            if(p==0 && q==0)
            {
                reverse(nums,0,nums.length-1);
                return ;
            }
    
            int temp=nums[p];
            nums[p]=nums[q];
            nums[q]=temp;
    
            reverse(nums,p+1,nums.length-1);
    
        }
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int testCase=sc.nextInt();
            while(testCase-->0)
            {
                int n=sc.nextInt();
                int nums[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    nums[i]=sc.nextInt();
                }
                arrayPermutation(nums);
                 for(int i=0;i<n;i++)
                {
                   System.out.print(nums[i]+" ");
                }
                System.out.println();
            }
    
        }
    }

