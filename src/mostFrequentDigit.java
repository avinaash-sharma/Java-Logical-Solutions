
import java.lang.*;
public class mostFrequentDigit {
    public static void main(String args[]) {
        int input1 = 12349, input2 = 9234, input3 = 4593, input4 = 6493;
        String stringInput1=Integer.toString(input1);
        String stringInput2=Integer.toString(input2);
        String stringInput3=Integer.toString(input3);
        String stringInput4=Integer.toString(input4);
        int length=stringInput1.length()+stringInput2.length()+stringInput3.length()+stringInput4.length();
        input1=Integer.parseInt(stringInput1);
        input2=Integer.parseInt(stringInput2);
        input3=Integer.parseInt(stringInput3);
        input4=Integer.parseInt(stringInput4);
        int arr[] = new int[4];

        arr[0] = input1;
        arr[1] = input2;
        arr[2] = input3;
        arr[3] = input4;
        int n, d, j = 0;
        int arr2[] = new int[length];
        for (int i = 0; i < 4; i++) {
            n = arr[i];
            while (n > 0) {
                d = n % 10;
                arr2[j] = d;
                j++;
                n = n / 10;
            }

        }
        int Value=0, count = 0;
        for (int i = 0; i < length; i++) {
            int tempValue = arr2[i];
            int tempCount = 0;
            for (int p = 0; p < arr2.length; p++) {
                if (arr2[p] == tempValue) {
                    tempCount++;
                    System.out.println("Element:"+arr2[p]+" tempValue:"+tempValue+" tempCount:"+tempCount);
                }
            }

            if (tempCount > count) {
                Value = tempValue;
                count=tempCount;
            }
            else if(tempCount==count)
            {
                if(tempValue>Value)
                {
                    Value=tempValue;
                }
                else
                {
                    Value=Value;
                }
            }

        }
        System.out.println(Value);
    }
}
