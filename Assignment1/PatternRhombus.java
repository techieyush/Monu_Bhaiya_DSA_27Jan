import java.util.*;
public class PatternRhombus {
    

   
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();
            int row=1;
            int nst=1;
            int space=num-1;
            int val=1;
            while(row<=2*num-1)
            {
                int i=1;
                while(i<=space)
                {
                    System.out.print("  ");
                    i++;
                }
                int j=1;
                int p=val;
                while(j<=nst)
                {
                    System.out.print(p+" ");
                    if(j<=nst/2)
                    {
                        p++;
                    }
                    else{
                        p--;
                    }
                    j++;
               
                  
                }
                if(row<num)
                {
                    nst+=2;
                    space--;
                    val++;
                }
                else
                {
                    space+=1;
                      nst-=2;
                      val--;
                }
               
                row++;
                
               
                System.out.println();
    
            }
    
        }
    }
    
    
