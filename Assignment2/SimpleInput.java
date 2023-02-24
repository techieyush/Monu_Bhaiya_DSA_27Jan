import java.util.*;
public class SimpleInput {
 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
      
        while(sum>=0)
        {
            int num=sc.nextInt();
            sum+=num;
            if(sum<0)
            {
                break;
            }
            else{
                System.out.println(num);
            }
        }
        
           
           
        
    }
}
    

