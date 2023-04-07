// package Lec_24_Recursion;

import java.util.ArrayList;
import java.util.List;
public class ValidParanthesisUsingList {
    public static void Paranthesis(int num,int open,int close,String ans,List<String>ll)
    {
        if(open==num && close==num)
        {
            System.out.print(ans+" ");
            ll.add(ans);
            return;
        }
        if(open<num)
        {
            Paranthesis(num, open+1, close, ans+"(",ll);
        }
        if(close<open)
        {
            Paranthesis(num, open, close+1, ans+")",ll);
        }
    }
    public static void main(String[] args) {
        int num=3;

        List<String>ll=new ArrayList<>();
        Paranthesis(num,0,0,"",ll);
    }
    
}
