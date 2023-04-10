// package Lec25_Recursion;

public class FindPathOfMatrix {

    public static int PrintPath(int cC,int cR,int eR,int eC,String ans)
    {
        //cc=currentColmns
        //cr=currentRow
        //eR=endRow
        //eC=endCol
        if(cR==eR && cC==eC)
        {
            System.out.println(ans);
            return 1;
        }
        if(cR>eR || cC>eC)
        {
            return 0;
        }
       int num1= PrintPath(cC+1,cR,eR,eC,ans+"H");
        int num2=PrintPath(cC,cR+1,eR,eC,ans+"V");
return num1+num2;
    }
    public static void main(String[] args) {
        int n=4;//row
        int m=5;//col
        System.out.println( PrintPath(0,0,n-1,m-1,""));
       


    }
    
}
