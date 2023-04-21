// package Lec_28;

public class Coin_permutation {

    public static void permutation(int[] coins,int amount,String ans)
    {
        if(amount==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coins.length;i++)
        {
            if(amount>=coins[i])
        {
            amount-=coins[i];
            permutation(coins, amount-coins[i], ans+coins[i]);
            amount+=coins[i];
        }
        }
    }
    public static void main(String[] args) {
        int[] coins={2,1,3,5};
        int amout=4;
        permutation(coins, amout, " ");

    }
    
}
