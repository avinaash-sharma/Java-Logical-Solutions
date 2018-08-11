import java.io.*;
public class patternDynamic {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number");
        int n=Integer.parseInt(br.readLine());

        int k=1;
        for(int i=2;i<=n;i++)
        {
            k=k+2;
        }
        int midPoint=k/2;
        System.out.println(k);
        int a[][]=new int[k][k];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                a[i][j]=0;
            }
        }
        int count=1;
        a[midPoint][midPoint]=count;
        int newPoint=midPoint+1;
        count++;
        System.out.println("MidPoint=>"+midPoint);
        while(newPoint!=k)
        {
            a[newPoint][newPoint]=count;
            count++;
            newPoint++;
        }
        count=1;
        newPoint=midPoint-1;
        count++;
        while(newPoint!=0)
        {
            a[newPoint][newPoint]=count;
            count++;
            newPoint--;
        }
        a[newPoint][newPoint]=count;

        for(int i=0;i<k;i++)
        {
            a[i][0]=n;
            a[i][k-1]=n;
        }
        for(int j=0;j<k;j++)
        {
            a[0][j]=n;
            a[k-1][j]=n;
        }
//        for(int i=0;i<k;i++)
//        {
//            while(a[][])
//        }

        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

}
