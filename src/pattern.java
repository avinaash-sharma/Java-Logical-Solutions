public class pattern {
    public static void main(String args[])
    {
        String a[][]=new String[5][5];

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
//                System.out.print(" * ");
                if(i==2 && j==2)
                {
                    a[i][j]=" 1 ";
                }
                else if(i==1 && (j!=0 && j!=4))
                {
//                    System.out.println(i+","+j);
//                    System.out.print(" 2 ");
                    a[i][j]=" 2 ";
                }
                else if(j==1 && (i!=0 && i!=4))
                {
//                    System.out.print(" 2 ");
                    a[i][j]=" 2 ";
                }
                else if(i==3 &&(j!=0 && j!=4))
                {
//                    System.out.print(" 2 ");
                    a[i][j]=" 2 ";
                }
                else if(j==3 && (i!=0 && i!=4))
                {
                    a[i][j]=" 2 ";
                }
                else if(i==0 || j==0 || i==4 || j==4)
                {
                    a[i][j]=" 3 ";
                }

            }

//            System.out.println();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}
