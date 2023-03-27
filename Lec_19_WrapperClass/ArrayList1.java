import java.util.*;
import java.lang.Integer;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> ayush=new ArrayList<>();
        System.out.println(ayush);
        System.out.println(ayush.size());
        ayush.add(10);
        ayush.add(20);
        ayush.add(40);
        System.out.println(ayush);
       
       
        System.out.println(ayush.size());
        
        
        ayush.add(2,30 );
        System.out.println(ayush);
        
        System.out.println(ayush.get(2));
        System.out.println(ayush.get(0));
      
        ayush.set(1, 15);
        System.out.println(ayush);

        ayush.remove(1);
        System.out.println(ayush);

    }
    
}
