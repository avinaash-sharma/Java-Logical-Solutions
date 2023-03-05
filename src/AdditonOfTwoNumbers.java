import java.sql.SQLOutput;
import java.util.Scanner;

class AdditonOfTwoNumbers{
    public static int sum(int n) {
        //write the logic here

        int d = 0;
        int sum=0;
        while(n !=0 ){
            d = n%10;
            sum = sum + d;
            n=n/10;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}