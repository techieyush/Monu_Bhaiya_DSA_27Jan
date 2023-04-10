import java.util.ArrayList;
import java.util.List;

// package Lec25_Recursion;

public class LeetCode17 {
    // static String  nums[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    public static void printSequence(String ques,String ans,List<String>ll)
    {
         String  nums[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(ques.length()==0)
        {
            // System.out.println(ans+" ");
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=nums[ch-48];
        for(int i=0;i<press.length();i++)
        {
            printSequence(ques.substring(1), ans+press.charAt(i),ll);
        }
    }
    public static void main(String[] args) {
        List<String>ll=new ArrayList<>();
        String ques="237";
        printSequence(ques,"",ll);

    }
    //if(digit.length()==0)
    // {
    //     return ll;
    // }
    
}
