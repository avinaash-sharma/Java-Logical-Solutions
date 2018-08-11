class Employee1
{
    int employeeNo;String employeeName;
    Employee1()
    {
        System.out.println("Employee No-arg Constructor Begins");
        employeeNo=0;employeeName=null;
        System.out.println("Employee No-arg Constructor Ends");
    }
    Employee1(int employeeNo){
        System.out.println("Employee 1 arg begins");
        this.employeeNo=employeeNo;
        this.employeeName="UNKONWN";
        System.out.println("Employee 1 arg ended");
    }
    Employee1(int employeeNo,String employeeName)
    {
        System.out.println("Employee 2 arg Begins");
        this.employeeNo=employeeNo;
        this.employeeName=employeeName;
        System.out.println("Employee 2 arg ended");
    }
    void display()
    {
        System.out.println("Employe Number: "+employeeNo);
        System.out.println("Employee Name: "+employeeName);
    }
}
class inheritanceDemo2 extends Employee1
{
    String department;

    inheritanceDemo2(int employeeNo,String employeeName,String department)
    {
        super(employeeNo,employeeName);
        System.out.println("Manager 3- args Constructor begins");
        this.department=department;
        System.out.println("Manager 3- args Constructor ends");

    }
    void display()
    {
        super.display();
        System.out.println("Department="+department);
    }
    public static void main(String args[])
    {
        System.out.println("[Main Function Begins-----------]");
        System.out.println("Creating an object for manager class");
        inheritanceDemo2 demo2=new inheritanceDemo2(10,"Avinash","CSIT");
        System.out.println("Printing the manager Details");
        demo2.display();
        System.out.println("[Main Function Ends-----------]");
    }
}
