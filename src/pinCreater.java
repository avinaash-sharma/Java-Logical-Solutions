public class pinCreater {
    public static void main(String args[])
    {
        int input1=190,input2=267,input3=853;
        int one,two,three;
        one=input1;
        two=input2;
        three=input3;
        one=one%10;
        two=two%10;
        three=three%10;
        int unitsPlace=Select(one,two,three);
        one=input1;
        two=input2;
        three=input3;
        one=one/10;
        one=one%10;

        two=two/10;
        two=two%10;

        three=three/10;
        three=three%10;
        int tensPlace=Select(one,two,three);


        one=input1;
        two=input2;
        three=input3;

        one=getThird(one);
        two=getThird(two);
        three=getThird(three);
        int hundreThPlace=Select(one,two,three);
        one=input1;
        two=input2;
        three=input3;
        one=getHighest(one);
        two=getHighest(two);
        three=getHighest(three);
        int fourthPlace;
        if(one>=two && one>=three)
            fourthPlace=one;
        else if(two>=one && two>=three)
            fourthPlace=two;
        else
            fourthPlace=three;
        System.out.println((fourthPlace*1000)+(hundreThPlace*100)+(tensPlace*10)+unitsPlace);//yahan pe return add kardena..
    }
    static int Select(int one, int two, int three)
    {
        int selected;
        if(one<=two && one<=three)
            selected=one;
        else if(two<=one && two<=three)
            selected=two;
        else
            selected=three;
        return selected;
    }
    static int getHighest(int value)
    {
        int n=value,d,max=0;
        while(n!=0)
        {
            d=n%10;
            if(max<d)
                max=d;
            n=n/10;
        }
        return max;
    }
    static int getThird(int value)
    {
        int n=value;
        int d;
        n=n/100;
        d=n%100;

        return d;
    }

}
