public class Array_Swap2 {
    public static void swaP(int[] arr, int[] othr)
    {
        int[] temp=arr;
        arr=othr;
        othr=temp;
        System.out.println(arr[0]+" "+othr[0]);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int [] othr={100,200,300,400,500};
        System.out.println(arr[0]+" "+othr[0]);
        swaP(arr,othr);
       
        System.out.println(arr[0]+" "+othr[0]);
        
        

      
    }
    
}
