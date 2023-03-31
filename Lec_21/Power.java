// package Lec_21;

public class Power {

    public static int Power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int a=Power(x,n-1);
        return a*x;
    }
    public static void main(String[] args) {
        int x=4;
        int n=5;
        System.out.println(Power(x,n));
    }
    
}
