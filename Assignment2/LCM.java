import java.util.*;
public class LCM {
 
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int divisor=sc.nextInt();
            int divident=sc.nextInt();
            int rem=0;
            int a=divident;
            int b=divisor;
            while(divisor%divident!=0) 
            {
                rem=divident%divisor;
                divident=divisor;
                divisor=rem;
            }
           
    
         
           int LCM=(a*b)/(divident);
            System.out.println(LCM);
    
        }
    }

