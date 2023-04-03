// package Lec_22_Recursion;

public class FibonaccaiUsingRecursion {

    public static int fibo(int num){
         
        if(num==0 || num==1)
        {
            return num;
        }
        int f1=fibo(num-1);
        int f2=fibo(num-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(fibo(num));
    }
    
}
