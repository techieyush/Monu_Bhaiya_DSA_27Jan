import java.util.ArrayList;
import java.util.List;

// package Lec_26_Recursion;

public class Lexicographically_Counting_print {

    public static void printCounting(int curr,int n,List<Integer>ll)
    {
        if(curr>n)
        {
            return;
        }
        // System.out.print(curr+"  ");
        ll.add(curr);
        int i=0;
        if(curr==0)
        {
            i=1;
        }
        for(;i<=9;i++)
        {
            printCounting(curr*10+i, n,ll);
        }
    }
    public static void main(String[] args) {
        List<Integer>ll=new ArrayList<>();
        int n=1000;
        printCounting(0,n);
    }
    
}
