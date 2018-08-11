import java.util.*;
public class pallendromePossibleorNot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int input1=sc.nextInt();
        int n=input1;
        int i;
        String value=Integer.toString(n);
        int length=value.length();
        n=Integer.parseInt(value);
        int arr[]=new int[length];
        while(n>0)
        {
            for(i=0;i<length;i++)
            {
                if((n%10)==i)
                    arr[i]++;
            }
            n=n/10;
        }
        int count=0;
        for(i=0;i<length;i++)
        {
            if((arr[i]%2)!=0)
                count++;
        }
        if(count > 1)
            System.out.println("Not Possible");
        else
            System.out.println("Possible");
    }
}
