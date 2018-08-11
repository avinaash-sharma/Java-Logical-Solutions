public class fibonacii {
    public static void main(String args[]){
        int a=0,b=1;
        int c=0,input1=5;
        int k=1;
        for (int i = 2; i <= input1; i++)
        {
            c = a + b;

            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
