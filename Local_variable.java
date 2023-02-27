public class Local_variable {
    static int val=100;
    public static void fun(int x)
    {
        int a=9;
        System.out.println(x);
        int val=90;
        Local_variable.val=120;
        System.out.println(Local_variable.val);
    }
    public static void main(String[] args) {
        System.out.println("hey");
        int x=60;
        System.out.println(val);
        fun(x);
        val=45;
        System.out.println(val);
        

        
    }
    
}
