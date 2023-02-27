public class Global_variable {
    static int val=200;
    public static void fun(int x)
    {
        int a=9;
        System.out.println(x);
        val=120;
        System.out.println(val);
    }
    public static void main(String[] args) {
        System.out.println("hey");
        int x=60;
        System.out.println(val);
        fun(x);
        System.out.println(val);

        
    }
    
}
