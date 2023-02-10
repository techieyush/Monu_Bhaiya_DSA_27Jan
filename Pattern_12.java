import java.util.Scanner;
public class Pattern_12 {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num=sc.nextInt();
        int row=1;
        int nst=1;
        int space=num-1;
        while(row<=num)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=nst)
            {
                if(j%2==0){
                    System.out.print("!");

                }
                else
                {
                    System.out.print("*");
                }
                
                j++;
            }

            System.out.println();
            row++;
            nst+=2;
            space--;


        }
    }
    
}

    

