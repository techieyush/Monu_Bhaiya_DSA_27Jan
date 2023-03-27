import java.util.*;


public class AddTwoNumbers {

    public static void addNum(int[] num1,int[] num2)
    {
        ArrayList<Integer>ayush=new ArrayList<>();
        int i=num1.length-1;
        int j=num2.length-1;
        int carry=0;

       while(i>=0 && j>=0)
       {
        int sum=num1[i]+num2[j]+carry;
        ayush.add(sum%10);
        carry=sum/10;
        i--;
        j--;
       }
       while(i>=0)
       {
        int sum=num1[i]+carry;
        ayush.add(sum%10);
        carry=sum/10;
        i--;
        
       }
       while(j>=0)
       {
        int sum=num2[j]+carry;
        ayush.add(sum%10);
        carry=sum/10;
        j--;
       }
       if(carry!=0)
       {
        ayush.add(carry);
       }
       Collections.reverse(ayush);
       for(int v:ayush)
       {
        System.out.print(v+" ");
       }

    }
    public static void main(String[] args) {    
        int []nums1={9,7};
        int []nums2={8,6};
        addNum(nums1, nums2);

    }
    
}
