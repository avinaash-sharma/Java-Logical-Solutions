import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
//        int a = 0, b = 1;
//        int c = 0, input1 = 515;
//        int k = 1;
//        for (int i = 2; i <= input1; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        System.out.println(b);

//        ---------------------------------------------
//        int a = 0, b = 1;
//        System.out.print(a + " ");
//        System.out.print(b + " ");
//        int c = 0, input = 9;
//        for(int i =2 ;i < input; i++){
//            c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }

//        fibonacii fibonacii = new fibonacii();
//        int n = 9, a = 0, b = 1;
//        int i = fibonacii.fibonaciiRecursive( n);
//        System.out.println(i);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a positive no: ");
//        int n = sc.nextInt();
//        int value = fibonacii.func(n);
//        System.out.println(value);

//        String st = "abc d efg";
//        fibonacii obj = new fibonacii();
//        obj.function(st);

        int n =3;
        fibonacii obj = new fibonacii();
        System.out.println(obj.sum(n));
    }

    public int sum (int n){
        int total = 0;
        if(n == 1){
            return 1;
        }
        else{
            return n + sum(n-1);

        }
    }
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }
    public int fibonaciiRecursive(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }
       return (fibonaciiRecursive(n-1) + fibonaciiRecursive(n-2))%10;
    }

    public static int func(int n) {
        if (n == 1)
            return n;
        else
            return func(n-1);
    }
}
