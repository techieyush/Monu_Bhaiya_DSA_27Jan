// package Binary_Search;

public class FirstBadVersion {
    public static int badVersion(int n)
    {
        int low=1;
        int ans=0;
        int high=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isBadVersion(mid)==true)
            {
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int bad=4;

    }
    
}
