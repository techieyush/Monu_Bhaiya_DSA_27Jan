import java.util.Scanner;

public class Leet_240 {
    public static boolean search(int nums[][],int target)
    {
        int row=0;
        int col=nums[0].length-1;
        while(row<nums.length && col>=0)
        {
            if(nums[row][col]==target)
            {
                return true;
            }
            else if(nums[row][col]>target)
            {
                col--;
            }
            else{
                row++;
            }
        }
        return false;
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
        int target=sc.nextInt();
        System.out.println(search(nums,target));
        








        }
    
}
