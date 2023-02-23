import java.util.*;
public class PrintSeries {
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
            
        for(int i=1;i<=n1;i++)
             {
            int num=3*i+2;
            if(num%n2!=0)
             {
                System.out.println(num);
            }
            else{
                n1++;
            }
          
        

        }
       
    }
}
    

