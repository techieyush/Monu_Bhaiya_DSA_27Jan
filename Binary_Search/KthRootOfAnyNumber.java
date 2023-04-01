// package Binary_Search;

public class KthRootOfAnyNumber {
   

    public static int kRoot(int n ,int k)
    {
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(Math.pow(mid,k)<=n)
            {
                ans=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=87;
        int k=3;
        System.out.println(kRoot(n, k));
        
    }
    
}
