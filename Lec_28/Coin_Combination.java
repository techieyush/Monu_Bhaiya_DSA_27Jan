public class Coin_Combination {
 

    public static void permutation(int[] coins,int amount,String ans,int idx)
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coins.length;i++)
        {
            if(amount>=coins[i])
        {
            // amount-=coins[i];
            permutation(coins, amount-coins[i], ans+coins[i],i);
            // amount+=coins[i];
        }
        }
    }
    public static void main(String[] args) {
        int[] coins={2,1,3,5};
        int amout=4;
        permutation(coins, amout, " ",0);

    }
    
}


