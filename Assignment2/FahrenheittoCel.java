package Assignment2;
import java.util.*;

public class FahrenheittoCel {
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int minfar=sc.nextInt();
        int maxfar=sc.nextInt();
        int steps=sc.nextInt();
       
        int newCel=0;
        for(int i=minfar;i<=maxfar;i+=steps)
        {
          
             int cel=(int)((5.0/9)*(i-32));
             System.out.println(i+"\t"+cel);
        }
       
    }
}

    

