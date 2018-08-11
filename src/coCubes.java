//Wap number a and get the value of the top three nearest 3 no's in the array
import java.util.*;
public class coCubes {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int index=0;
        System.out.println("Enter the elements in Array");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the nearest Value");
        int number=sc.nextInt();
        System.out.println("Enter the no of value nearest");
        int noOfValues=sc.nextInt();
        int diff=Math.abs(number-arr[0]);
        int closest=0;
        int newDiff;
                int i=1;
        while(noOfValues!=0)
        {
            for(;i<arr.length;i++)
            {
                newDiff=Math.abs(number-arr[i]);
                if(newDiff<diff) {
                    diff = newDiff;
                    closest=arr[i];
                }
            }
            noOfValues--;
            System.out.println(closest);
        }

    }
}
