// package Lec_23_Recursion;

public class PrintheadNotDouble {

    public static void PrintHead(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H' )
        {
            PrintHead(n-1,ans+"H");
        }
       
        PrintHead(n-1, ans+"T");

    }
    public static void main(String[] args) {
        int n=3;
        PrintHead(n,"");
    }
    
}
