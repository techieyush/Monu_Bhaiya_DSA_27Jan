import java.util.*;
public class ShoppingGame {
   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long testCase=sc.nextInt();
        while(testCase-->0)
        {
            long Ayush=sc.nextInt();
            long harshit=sc.nextInt();
            if(!(harshit>Ayush+1))
            {
                System.out.println("Aayush");
            }
            else{
                System.out.println("Harshit");
            }
        }

    }
}
    

