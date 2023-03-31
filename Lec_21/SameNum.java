

public class SameNum {
    // package Lec_21;



    public static void reverse(int n)
    {
    if(n==0)
    {
        return ;
    }
    reverse(n-1);
    System.out.println(n);
        
        
    }
    public static void main(String[] args) {
        int num=5;
        reverse(num);
    }
    



    
}
