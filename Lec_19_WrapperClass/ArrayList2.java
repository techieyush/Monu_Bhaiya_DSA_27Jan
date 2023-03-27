import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer>ayush1=new ArrayList<>();
        ayush1.add(10);
        ayush1.add(20);
        ayush1.add(30);
        ayush1.add(40);
        ayush1.add(50);
        System.out.println(ayush1);
        for(int i=0;i<ayush1.size();i++)
        {
            System.out.println(ayush1.get(i)+" ");
        }
        for(int p:ayush1)
        {
            System.out.print(p+" ");
        }


    }
}
