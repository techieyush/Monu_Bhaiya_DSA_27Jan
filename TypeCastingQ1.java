import java.util.*;
public class TypeCastingQ1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int i=122;
        byte j=10;
        j=(byte)(i);
        System.out.println(j);
        i=j;
        long l=10;
        System.out.println(i);
        byte b=-5;
        int a=b;
        System.out.println(a);
        // long l=10000000000l;
        // l =sc.nextLong();  
        double d=78.8;
        float f=5.7f;
        d=f;
        f=(float)(d);
        char ch='c';
        char ch1='n';
        System.out.println(ch+ch1);
        int m=(int)2147483648l+(int)2147483648l;
        System.out.println(m);

        System.out.print((int)(ch));
    }
    
}
