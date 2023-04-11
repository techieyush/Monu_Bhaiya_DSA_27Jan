// package Lec_26_Recursion;

public class TowerOfHanoi {
    static int count=0;

    public static void toh(int num,String src,String hlpr,String dest)
    {
        if(num==0)
        {
            return;
        }
        toh(num-1,src,dest,hlpr);
        System.out.println("Move"+num+"th from"+src+"to"+dest);
        count++;
        toh(num-1,hlpr,src,dest);
    }
    public static void main(String[] args) {
        int n=5;
        toh(n,"Source","Helper","Destination");
        System.out.println(count);
    }
    
}
