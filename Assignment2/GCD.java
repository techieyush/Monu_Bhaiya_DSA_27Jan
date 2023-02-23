import java.util.*;
public class GCD {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int divisor=sc.nextInt();
        int divident=sc.nextInt();
        int rem=0;
        while(divisor%divident!=0) 
        {
            rem=divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.println(divident);



    }
}
    

