import java.util.*;
public class ValidAge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Age=sc.nextInt();
        if(Age>=18)
        {
            System.out.println("Eligible to Vote");
        }
        else
        {
            System.out.println("Not Eligible to Vote");
        }
   
    }
    
}
