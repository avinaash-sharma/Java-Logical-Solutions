class seriesSum{
public static void main(String args[]){
    int input1=5,input2=10,input3=2;
    int sum=0;
        for(int i=1;i<=input1;i++)
        {

            for(int j=1;j<=i;j++)

            {


                sum=sum+input2;
//                System.out.print(input2+" ");

            }
//            System.out.println();

            input2=input2+input3;
        }

        System.out.println(sum);
}
}