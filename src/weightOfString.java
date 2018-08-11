public class weightOfString {
    public static void main(String args[])
    {
        String input1="Hello World!!";
        int input2=0;
        input1=input1.toLowerCase();
        System.out.println(input1);
        int length=input1.length();
        char ch;
        int i=0,sum=0;
        if(input2==0)
        {
            while(i<length)
            {
                ch=input1.charAt(i);
                System.out.println(ch);

                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                {
                    if(ch>=97 && ch<=122) {
                        System.out.println((int)ch-96);
                        sum = sum + ((int)ch - 96);
                    }
                }

                    i++;

            }
        }
        else
        {
            while(i<length)
            {
                ch=input1.charAt(i);
                if(ch!=' '||ch!='!'){
                    if(ch>=97 && ch<=122) {
                        ch = input1.charAt(i);
                        sum = sum + ((int)ch - 96);
                    }
                }
                i++;

            }
        }
        System.out.println(sum);
    }
}
