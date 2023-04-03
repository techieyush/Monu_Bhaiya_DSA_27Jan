// package Lec_22_Recursion;

public class FactorialTailRecursion {

    public static int factorialTail(int num,int ans)
    {
        if(num==0)
        {
            return ans;
        }
    return factorialTail(num-1,ans*num);
    }
    public static void main(String[] args) {
        int num=5;
       int ans=1;
        System.out.println(factorialTail(num,ans));
    }

    
}
