package Assignment2;
import java.util.*;
import java.lang.Math.*;

public class InverseOfaNumber {
    public static void main(String[] args) {
       
Scanner sc = new Scanner(System.in);
        
        int num=sc.nextInt();
        int pos=1;
        int sum=0;
        
        while(num>0)
        {
            int rem=num%10;
           
            sum=sum+(int)(pos*Math.pow(10,rem-1));
            pos++;
            num=num/10;
            

        }
            System.out.println(sum);
    }
        
    }
    

