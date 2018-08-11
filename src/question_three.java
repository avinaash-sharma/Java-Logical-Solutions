import java.io.*;
import java.util.*;

public class question_three {
    public static void main(String args[])
    {
        int n=Integer.parseInt("5");
        Stack<Integer> st=new Stack<>();

        int a=0;
        int b=1;
        int count=0;
        int c=0;
        st.push(a);
        st.push(b);

        while(count!=n)
        {
            c=Fibonacii(a,b);

            st.push(c);
            a=b;
            b=c;
            count++;
        }
        System.out.print(st);


    }
    public static int Fibonacii(int a,int b)
    {
        int c;
        c=a+b;
        a=b;
        b=c;
        return c;
    }
}
