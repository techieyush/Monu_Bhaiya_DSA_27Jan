import java.util.*;
   
public class HelpRamu {
    
    
        
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int testCase=sc.nextInt();
            while(testCase-->0)
            {
                int C1=sc.nextInt();
                int C2=sc.nextInt();
                int C3=sc.nextInt();
                int C4=sc.nextInt();
                int n=sc.nextInt();
                int m=sc.nextInt();
                int rickshaw[]=new int[n];
                int cab[]=new int[m];
                for(int i=0;i<rickshaw.length;i++)
                {
                    rickshaw[i]=sc.nextInt();
                }
                for(int i=0;i<cab.length;i++)
                {
                    cab[i]=sc.nextInt();
                }
    
            int ric_ride=0;
            int cab_ride=0;
            for(int i=0;i<rickshaw.length;i++)
            {
                ric_ride+=Math.min(rickshaw[i]*C1,C2);
            }
             for(int i=0;i<cab.length;i++)
            {
                cab_ride+=Math.min(cab[i]*C1,C2);
            }
            ric_ride=Math.min(ric_ride,C3);
            cab_ride=Math.min(cab_ride,C3);
    
           int ans=Math.min(ric_ride+cab_ride,C4);
    
            System.out.println(ans);
            }
        }
    }

