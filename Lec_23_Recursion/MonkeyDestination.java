// package Lec_23_Recursion;

public class MonkeyDestination {

    public static void monkeyJump(int n,int curr,String ans)
    {
        if(curr==n)
        {
            System.out.println(ans+" ");
            return;
        }
        if(curr>n)
        {
            return;
        }
        // monkeyJump(n,curr+1,  ans+"1");
        // monkeyJump(n,curr+2,  ans+"2");
        // monkeyJump(n,curr+3, ans+"3");
        for(int dice=1;dice<=3;dice++)
        {
            monkeyJump(n, curr+dice, ans+dice);
        }

    }
    public static void main(String[] args) {
        int n=4;
        monkeyJump(n,0,"");
    }
    
}
