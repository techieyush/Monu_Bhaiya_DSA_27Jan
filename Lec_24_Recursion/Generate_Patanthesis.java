// package Lec_24_Recursion;

public class Generate_Patanthesis {

    public static void Paranthesis(int num,int open,int close,String ans)
    {
        if(open==num && close==num)
        {
            System.out.print(ans+" ");
            return;
        }
        if(open<num)
        {
            Paranthesis(num, open+1, close, ans+"(");
        }
        if(close<open)
        {
            Paranthesis(num, open, close+1, ans+")");
        }
    }
    public static void main(String[] args) {
        int num=3;
        Paranthesis(num,0,0,"");
    }
    
}
