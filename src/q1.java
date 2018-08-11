import java.io.*;
import java.util.*;
class EmployeeDetails
{
    String ID,firstName,rName,dateOfBirth,dept,salary;
    Employee next;

}
public class q1 {
    public static void main(String args[]) throws IOException {
        LinkedList<EmployeeDetails> linkedList=new LinkedList<>();
//        ArrayList<EmployeeDetails> arrayList=new ArrayList<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\t\t\t\tOperations Available");
            System.out.println("1.Add\n2.Search\n3.Delete");
            int choice = Integer.parseInt(br.readLine());
            EmployeeDetails obj=new EmployeeDetails();
            switch (choice) {
                case 1:
                    System.out.println("Enter the ID,First Name,rName,Date Of Birth,Department,Salary");
                    obj.ID = br.readLine();
                    obj.firstName = br.readLine();
                    obj.rName = br.readLine();
                    obj.dateOfBirth = br.readLine();
                    obj.dept = br.readLine();
                    obj.salary = br.readLine();


                    linkedList.add(obj);
                    for(EmployeeDetails e : linkedList)
                    {
                        System.out.println(e.firstName+" is registered");
                    }
                    break;
                case 2:
                    System.out.println("Enter the First Name to Search");
                    String searchName = br.readLine();
                    for(EmployeeDetails e : linkedList)
                    {
                        if(e.firstName.toLowerCase().equals(searchName.toLowerCase()))
                        {
                            System.out.println("Available");
                        }
                        else
                        {
                            System.out.println("Not Available");

                        }


                    }
                    break;

                case 3:
                    System.out.println("Size of Array:"+linkedList.size());
                    if(linkedList.isEmpty())
                    {
                        System.out.println("Empty List");
                        break;
                    }
                    else
                    {
                        linkedList.remove();
                        System.out.println("Done");
                        break;
                    }

                default:System.out.println("Wrong Out Put");
            }
        }
    }
}
