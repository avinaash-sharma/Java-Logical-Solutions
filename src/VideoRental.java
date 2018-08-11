import java.util.*;
import java.io.*;
class Video{

    String videoName;
    boolean checkOut;
    int rating;
    public Video(String videoName){
        this.videoName=videoName;
    }
    String getName(){

        return videoName;
    }
    void doCheckOut(){

    }
    void doReturn(){

    }
    void recieveRating(int rating){

    }
    int getRating(){
        return rating;
    }
    boolean getCheckOut(){
        return checkOut;
    }
}
class VideoStore extends Video{


    Video store[];

    public VideoStore(String videoName) {
        super(videoName);
    }

    void addVideo(String name){

    }
    void doCheckOut(String name){

    }
    void doReturn(String name){

    }
    void recieveRating(String name,String rating){

    }
    void listInventory(){


    }

}
public class VideoRental {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice=0,rating;
        String name="";
        ArrayList<Video> arrayList=new ArrayList<>();

        while(choice!=6)
        {
            System.out.println("\t\t\tMain Menu\t\t\t");
            System.out.println("1.Add Video");
            System.out.println("2.Check Out Video");
            System.out.println("3.Return Video");
            System.out.println("4.Recive Video");
            System.out.println("5.List Videos");
            System.out.println("6.Exit");
            System.out.println("Choose any from 1-6");
            choice=Integer.parseInt(br.readLine());
            VideoStore vs=new VideoStore(name);
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the name of the Video");
                    name=br.readLine();

                    vs.checkOut=false;
                    vs.rating=0;
                    arrayList.add(vs);
                    break;
                case 2:
                    System.out.print("Enter the name of the video to Check out");
                    name=br.readLine();

                    vs.doCheckOut(name);

                    break;
                case 3:
                    System.out.print("Enter the name of the video to be RETURNED");
                    name=br.readLine();

                    break;
                case 4:
                    System.out.println("Enter the name of the video to Rate");
                    name=br.readLine();
                    System.out.println("Enter your rating");
                    rating=Integer.parseInt(br.readLine());
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("\t\t\tThank you");
                    break;
                default:System.out.println("Wrong Input");
                break;
            }
        }
    }
}
