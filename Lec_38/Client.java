package Lec_38;

public static void main(String[] args) {
    // TODO Auto-generated method stub
    // case 1
//		P obj = new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();

    // case 2

//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C) (obj)).d2);
//		System.out.println(((C) (obj)).d);
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();

    // Case 3
//		C obj = new  P();

    // case 4
    C obj = new C();
    System.out.println(obj.d);
    System.out.println(((P) (obj)).d);
    System.out.println(obj.d1);// 10
    System.out.println(obj.d2);/// 20
    obj.fun();
    obj.fun2();
    obj.fun1();

}

