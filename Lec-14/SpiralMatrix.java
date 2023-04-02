

import java.util.Scanner;



public class SpiralMatrix {
    public static void spiral(int matrix[][])
    {
        int minRow=0;
        int maxRow=matrix.length-1;
        int minCol=0;
        int count=0;
        int maxCol=matrix[0].length-1;
        int totalElement=matrix.length*matrix[0].length;
        while(count<totalElement)
        {

            for(int i=minCol;i<=maxCol&&count<totalElement;i++)
            {
                System.out.print(matrix[minRow][i]+" ");
                count++;
            }
            minRow++;
            for(int i=minRow;i<=maxRow&&count<totalElement;i++)
            {
                System.out.print(matrix[i][maxCol]+" ");
                count++;
            }
            maxCol--;
            for(int i=maxCol;i>=minCol&&count<totalElement;i--)
            {
                System.out.print(matrix[maxRow][i]+" ");
                count++;
            }
            maxRow--;
            for(int i=maxRow;i>=minRow&&count<totalElement;i--)
            {
                System.out.print(matrix[i][minCol]+" ");
                count++;
            }
            minCol++;
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
        spiral(nums);
       

    }
    
}
