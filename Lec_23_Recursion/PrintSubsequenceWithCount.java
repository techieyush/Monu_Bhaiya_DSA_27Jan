// package Lec_23_Recursion;

public class PrintSubsequenceWithCount {

    
    public static int PrintSeq(String str,String ans)
    {
       
        if(str.length()==0)
        {
            System.out.print(ans+" ");
        //    count++;
            return 1;
        }
        char ch=str.charAt(0);
       int n1= PrintSeq(str.substring(1), ans);
       int n2= PrintSeq(str.substring(1), ans+ch);
       return n1+n2;
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        System.out.println("\n"+PrintSeq(str,ans));
       
        // System.out.println(count);
    }
    // static  int count=0;
    
}
