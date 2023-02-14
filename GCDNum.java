import java.util.Scanner;

public class GCDNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Greatest common Divisor 
        // divisor<divident
        int divisor=sc.nextInt();
        int divident=sc.nextInt();
        // while(divident%divisor!=0)
       
        for(;divident%divisor!=0;)
         {
            int rem=divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.print(divisor);
    }
    
}
