import java.util.Scanner;
public class PrintSubStringAccordingtoLEngth {

    public static void printSubstring(String str)
    {
        int n=str.length();
        for(int length=1;length<=n;length++)
        {
            for(int j=length;j<=n;j++)
            {
                int i=j-length;
                System.out.println(str.substring(i, j));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        printSubstring(str);


    }
    
}
