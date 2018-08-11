class A{
    int m,n;
    void display1(){
        System.out.println("m and n are: "+m+" "+n);
    }
}
class B extends A{
    int c;
    void display2(){
        System.out.println("c:"+c);
    }
    void sum(){
        System.out.println("m+n+c="+(m+n+c));
    }
}
public class inheritanceDemo1 {
    public static void main(String args[])
    {
        A s1=new A();
        B s2=new B();
        s1.m=90;s1.n=80;
        System.out.println("State of  object A");
        s1.display1();
        s2.m=10;s2.n=90;s2.c=9;
        System.out.println("State of object B");
        s2.display1();
//        s1.display1();
        s2.display2();
        System.out.println("Sum of n and m and c in object B is:");
        s2.sum();
    }

}
