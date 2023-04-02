

import java.util.Scanner;



public class MatrixTrasnpose {
    public static void transpose(int matrix[][])
    {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
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
        transpose(nums);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    
}
