// package Lec_21;

public class reverseNum {

    public static void reverse(int n)
    {
    if(n==0)
    {
        return ;
    }
        System.out.println(n);
        reverse(n-1);
        
    }
    public static void main(String[] args) {
        int num=5;
        reverse(num);
    }
    
}
