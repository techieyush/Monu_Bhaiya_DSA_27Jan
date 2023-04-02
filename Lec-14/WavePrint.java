
import java.util.Scanner;

public class WavePrint {
    



    public static void matrixPrint(int matrix[][])
    {
        int row=matrix.length;
        int col=matrix[0].length;
        for( int i=0;i<col;i++)
        {
            if(col%2==0)
            {
                for(int j=0;j<row;j++)
                {
                    System.out.print(matrix[j][i]+" ");
                }
            }
            else{
                for(int j=matrix.length-1;j>=0;j--)
                {
                    System.out.print(matrix[j][i]+" ");
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }

        matrixPrint(nums);
    }
    
}

    

