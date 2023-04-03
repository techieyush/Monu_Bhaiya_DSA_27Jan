// package Lec_22_Recursion;

public class PrintAllSubsequenceOfString {
   public static void PrintSubseq(String str,String ans)
   {
   
    if(str.length()==0)
    {
        System.out.println(ans+" ");
        
        return;
    }
    char ch=str.charAt(0);
    PrintSubseq(str.substring(1), ans);
    PrintSubseq(str.substring(1), ans+ch);
   }

 
    public static void main(String[] args) {
        String str="abc";
       PrintSubseq(str,"");
       
    }
    
}
