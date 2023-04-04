// package Lec_23_Recursion;

public class PossibleCoinsSubsequence {

    public static void prinAns(int num,String ans)
    {
        if(num==0)
        {
            System.out.println(ans+" ");
            count++;
            return;
        }
        prinAns(num-1, ans+"H");
        prinAns(num-1, ans+"T");
    }
    public static void main(String[] args) {
        int num=3;
        prinAns(num, "");
        System.out.println(count);

    }
    static int count=0;
    
}
