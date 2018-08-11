class One{
//    static int a=10;
   public One(){

        System.out.println("This is the first Class Constructor");
    }
}
class Two extends One{
    Two(){
//        super (a);
        System.out.println("This is the Second Class Constructor");
    }
}
class Three extends Two{
    Three()
    {

        System.out.println("This is third Class Constructor");
    }
}
public class inheritanceDemo3 {
    public static void main(String args[])
    {
        Three three=new Three();
    }
}
