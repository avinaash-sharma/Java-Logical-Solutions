import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Point
{
    double distance;
    double x1,y1,x2,y2;
    double midPointY,midPointX;
    double slope;
    void setPoint(double x1,double y1,double x2,double y2)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    void printPoint()
    {
        System.out.println("Distance :"+distance);
        System.out.println("Midpoint: "+midPointX+" ,"+midPointY);
        System.out.println("Slope: "+slope);
    }
    double findDistance(Point point)
    {
        distance=Math.sqrt((point.x2-point.x1)*(point.x2-point.x1)+(point.y2-point.y1)*(point.y2-point.y1));

        return distance;
    }
    void findMidpoint(Point point)
    {
        midPointX=(point.x2+point.x1)/2.0;
        midPointY=(point.y2+point.y1)/2.0;
    }
    void findSlope(Point point)
    {
        slope=(point.y2-point.y1)/(point.x2-point.x1);
    }
}
public class firstAssignment {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of first point");
        double x1=Integer.parseInt(br.readLine());
        double x2=Integer.parseInt(br.readLine());
        System.out.println("Enter the value of second point");
        double y1=Integer.parseInt(br.readLine());
        double y2=Integer.parseInt(br.readLine());
        Point point=new Point();
        Point ob=new Point();
        point.setPoint(x1,y1,x2,y2);
        ob.findDistance(point);
        ob.findMidpoint(point);
        ob.findSlope(point);
        ob.printPoint();
    }
}
