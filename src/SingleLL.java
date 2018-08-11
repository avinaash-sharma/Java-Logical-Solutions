import java.util.Scanner;
class Node
{
    int data;
    Node next;
    public Node(int x)
    {
        data=x;
    }
}
class Link
{
    private Node first;
    Node temp;
    int count;
    public Link()
    {
        first=null;
        count=0;
    }
    public void create(int value)
    {
        if(count==0)
        {
            Node n=new Node(value);
            n.next=null;
            temp=n;
            first=n;
            count++;
        }
        else
        {
            Node n=new Node(value);
            n.next=null;
            temp.next=n;
            temp=n;
            count++;
        }
    }
    public void insertFirst(int value)
    {
        if(count==0)
        {
            Node n=new Node(value);
            n.next=null;
            temp=n;
            first=n;
            count++;
        }
        else
        {
            Node n=new Node(value);
            n.next=first;
            first=n;
            count++;
        }
    }
    public void insertEnd(int value)
    {
        if(count==0)
        {
            Node n=new Node(value);
            n.next=null;
            temp=n;
            first=n;
            count++;
        }
        else
        {	temp=first;
            while(true)
            {
                if(temp.next==null)
                {
                    break;
                }
                else
                {
                    temp=temp.next;
                }
            }
            Node n=new Node(value);
            n.next=null;
            temp.next=n;
            count++;
        }
    }
    public void insertPost(int value,int post)
    {
        if(count==0)
        {
            System.out.println("create node first");
        }
        else if(post>count)
        {
            System.out.println("Position not present....position of last node is "+count);
        }
        else
        {
            int pos=1;
            temp=first;
            while(pos<post-1)
            {
                temp=temp.next;
                pos++;
            }
            Node n=new Node(value);
            n.next=temp.next;
            temp.next=n;
            count++;
        }
    }
    public void deleteBeg()
    {
        if(count==0)
        {
            System.out.println("underflow");
        }
        else
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
    }
    public void deleteEnd()
    {
        if(count==0)
        {
            System.out.println("underflow");
        }
        else
        {
            temp=first;
            if(count==1)
            {
                first=null;
                count--;
            }
            else
            {
                while(true)
                {
                    if(temp.next.next==null)
                    {
                        break;
                    }
                    else
                    {
                        temp=temp.next;
                    }
                }
                temp.next=null;
                count--;
            }
        }
    }
    public void deletePost(int post)
    {
        if(count==0)
        {
            System.out.println("create node first");
        }
        else if(post>count)
        {
            System.out.println("Position does not exixt......position of last node is "+count);
        }
        else
        {
            int pos=1;
            temp=first;
            while(pos<post-1)
            {
                temp=temp.next;
                pos++;
            }
            temp.next=temp.next.next;
            count--;
        }
    }
    public int search(int value)
    {
        int pos=1;
        if(count==0)
        {
            System.out.println("Element not found as linked list not created");
        }
        else
        {
            temp=first;
            while(temp!=null)
            {
                if(temp.data==value)
                {
                    return pos;
                }
                else
                {
                    temp=temp.next;
                    pos=pos+1;
                }
            }
        }
        return -1;
    }
    public void display()
    {
        if(count==0)
        {
            System.out.println("empty");
        }
        else
        {
            temp=first;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
}
class SingleLL
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Link l=new Link();
        int value;
        while(true)
        {
            System.out.println("\t\t\t\t\t\tmenu");
            System.out.println("1-create\n2-insert at the beginning\n3-insert at the end\n4-insert at any position\n5-delete from beginning\n6-delete from end\n7-delete at any position\n8-Search element\n9-display\n10-exit");
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            int post;
            char ch;
            System.out.println("output:");
            if(choice==1)
            {
                while(true)
                {
                    System.out.println("enter value:");
                    value=sc.nextInt();
                    l.create(value);
                    System.out.println("want to enter more?(y/n)");
                    ch=sc.next().charAt(0);
                    if(ch=='n')
                    {
                        break;
                    }
                }
            }
            else if(choice==2)
            {
                while(true)
                {
                    System.out.println("enter value:");
                    value=sc.nextInt();
                    l.insertFirst(value);
                    System.out.println("want to insert more?(y/n/)");
                    ch=sc.next().charAt(0);
                    if(ch=='n')
                    {
                        break;
                    }
                }
            }
            else if(choice==3)
            {
                while(true)
                {
                    System.out.println("enter value:");
                    value=sc.nextInt();
                    l.insertEnd(value);
                    System.out.println("want to insert more?(y/n/)");
                    ch=sc.next().charAt(0);
                    if(ch=='n')
                    {
                        break;
                    }
                }
            }
            else if(choice==4)
            {
                System.out.println("Enter value:");
                value=sc.nextInt();
                System.out.println("Enter position:");
                post=sc.nextInt();
                l.insertPost(value,post);
            }
            else if(choice==5)
            {
                l.deleteBeg();
            }
            else if(choice==6)
            {
                l.deleteEnd();
            }
            else if(choice==7)
            {
                System.out.println("Enter position:");
                post=sc.nextInt();
                l.deletePost(post);
            }
            else if(choice==8)
            {
                System.out.println("enter element:");
                value=sc.nextInt();
                int p=l.search(value);
                if(p==-1)
                {
                    System.out.println("Search not found");
                }
                else
                {
                    System.out.println("Search found at position "+p);
                }
            }
            else if(choice==9)
            {
                l.display();
            }
            else if(choice==10)
            {
                break;
            }
            else
            {
                System.out.println("Wrong input");
            }
        }
    }
}
