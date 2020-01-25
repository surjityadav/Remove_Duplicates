


import java.util.*;


public class remove_Duplicates 
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    remove_Duplicates()
    {
        head=null;
    }
    
    static remove_Duplicates insert(remove_Duplicates li,int d)
    {
        Node n=new Node(d);
        if(head == null)
        {
            head=n;
        }
        else
        {
            Node temp=head;
            while(temp.next!= null)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.next=null;
        }
        return li;
    }
    static void display()
    {
        if(head == null)
        {
            System.out.println("NULL");
        }
        else
        {
            Node temp=head;
            while(temp !=null)
            {
                if(temp.data!=0)
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    static Node removeDuplicate(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            Node temp1=temp.next;
            while(temp1!=null)
            {
                if(temp.data == temp1.data)
                {
                    temp1.data=0;
                }
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String args[])
    {
        remove_Duplicates li=new remove_Duplicates();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        System.out.println("Eneter Element");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            li.insert(li,a[i]);
        }
        System.out.println("With Duplicate");
        display();
        System.out.println();
        System.out.println("Without Duplicate");
        li.removeDuplicate(head);
        display();
    }

}
