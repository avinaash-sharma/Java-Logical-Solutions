class first{

    first(){

        System.out.println("This is No arg First's Constructor");
    }
    first(int a)
    {
        System.out.println("First's Constructor "+a);
    }

}
class second extends first{
    second(){
        super(50);
        System.out.println("This is No arg seconds's Constructor");
    }
    second(int b){
        this("x");
        System.out.println("Seconds's Constructor "+b);
    }
    second(String b){
        super(1000);
        System.out.println("Second's String wala Constructor "+b);
    }
}
class third extends second{
    third()
    {

        System.out.println("This is No arg third's Constructor");
    }
    third(int c)
    {
        super(100);
        System.out.println("third's Constructor "+c);
    }
}
public class inheritanceDemo4 {
    public static void main(String args[]){
        third third=new third(10);
    }
}
