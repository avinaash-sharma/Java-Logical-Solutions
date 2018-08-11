import java.util.Arrays;

public class arraySort {
    public static void main(String args[])
    {

        int arr[]={8,6,7,2,1,5,9};
        Arrays.sort(arr);
        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
