import java.io.*;
class Employee
{
    String ID,firstName,rName,dateOFBirth,dept,salary;
    Employee next;
            public Employee(String ID,String firstName,String rName,String dateOFBirth,String dept,String salary)
            {
                this.ID=ID;
                this.dateOFBirth=dateOFBirth;
                this.firstName=firstName;
                this.rName=rName;
                this.dept=dept;
                this.salary=salary;

    }
}
class Operations
{
    private Employee first;
    Employee temp;
    int count=0;
    public Operations()
    {
        first=null;
        count=0;
    }
    public void add(String ID,String firstName,String rName,String dateOFBirth,String dept,String salary)
    {
        if(count==0)
        {
            Employee ob=new Employee(ID,firstName,rName,dateOFBirth,dept,salary);
            ob.next=null;
            temp=ob;
            first=ob;
            count++;
            display();
        }
        else
        {
            Employee ob=new Employee(ID,firstName,rName,dateOFBirth,dept,salary);
            ob.next=null;
            temp.next=ob;
            count++;
            temp=ob;
            display();
        }
    }
    public int search(String firstName)
    {
        if(count ==0)
        {
            System.out.println("Not Possible underFlow");
            return 0;
        }

        System.out.println("This is Search Function");
        temp=first;
        while(temp!=null) {
//            System.out.println(temp.firstName.toLowerCase()+","+firstName.toLowerCase());
            if (temp.firstName.toLowerCase().equals( firstName.toLowerCase())) {
//                System.out.println("Success");
                return 1;
            }
            else
                temp=temp.next;
        }

        return 0;

    }
    public void delete(String firstName)
    {
        if(count==0)
        {
            System.out.println("Not Possible as List is Empty");
        }
        else if(first.firstName.toLowerCase().equals(firstName.toLowerCase()))
        {
            if(count==1)
            {
                first=null;
                count--;
            }
            else
            {
                first=first.next;
                count--;
            }
        }
        else
        {
            temp=first;
            while(temp!=null)
            {
                if(temp.firstName.toLowerCase().equals(firstName.toLowerCase()))
                {

                }
            }
        }
    }
    public void display()
    {
        temp=first;
        while(temp!=null)
        {
            System.out.print(temp.firstName+"->");

            temp=temp.next;
        }
        System.out.println();
    }
}
public class question_one {
    public static void main(String args[]) throws IOException {
        Operations obj = new Operations();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("\t\t\t\tOperations Available");
            System.out.println("1.Add\n2.Search\n3.Delete");
            int choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the ID,First Name,rName,Date Of Birth,Department,Salary");
                    String ID = br.readLine();
                    String firstName = br.readLine();
                    String rName = br.readLine();
                    String dateOfBirth = br.readLine();
                    String dept = br.readLine();
                    String salary = br.readLine();
                    obj.add(ID, firstName, rName, dateOfBirth, dept, salary);
                    break;
                case 2:
                    System.out.println("Enter the First Name to Search");
                    String searchName = br.readLine();
                    int result = obj.search(searchName);
                    if (result == 1) {
                        System.out.println("Available");
                    } else {
                        System.out.println("Not Available");
                    }
                    break;
                case 3:
                    System.out.println("Enter the First Name to delete");
                    String delName=br.readLine();
                    obj.delete(delName);
                    System.out.println("Done");
                    break;
                 default:System.out.println("Wrong Out Put");
            }
        }
    }
}
