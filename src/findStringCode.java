import java.io.*;
import java.util.*;
public class findStringCode {
    public static void main(String args[]) {
        String string="World Wide Web";
        string=string.toLowerCase();
        String arr[]=string.split(" ");
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            int length=word.length();
            int rev=length-1;
            int sum=0;
            for(int j=0;j<length;j++)
            {
                if(rev>=j) {
                    if (j == rev) {
                        sum = sum + Math.abs((int) word.charAt(j) - 96);
                        System.out.println("OnEqual:Letter is "+word.charAt(j));
                        System.out.println("OnEqual:"+sum);
                    } else {
                        sum = sum + Math.abs(Math.abs((int) word.charAt(j)-96)-Math.abs((int)word.charAt(rev)-96));
                    }
                }
                rev--;
            }
            arr2[i]=sum;
            sum=0;
        }
        int outPut=0;
        for(int i=0;i<arr2.length;i++)
        {
            outPut=(outPut*100)+arr2[i];
        }
        System.out.println(outPut);
    }
}