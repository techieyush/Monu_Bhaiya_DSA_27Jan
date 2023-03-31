// package Lec_21;

public class Factorial {
    

    public static int fact(int num)

    {
        if(num==0 || num==1)
        {
            return 1;
        }
        int fn=fact(num-1);
        return num*fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));

    }
    
}

    

