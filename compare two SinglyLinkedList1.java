import java.util.*;
class Node 
{
    int data;
    Node next;
    Node(int num)
    {
        this.data=num;
        this.next=null;
    }
}
class SinglyLinkedList1 
{
    Node head = null;
    Node temp = null;
    public void insertNode(int num) 
    {
        Node newNode = new Node(num);
        if (head == null) 
        {
            head = temp = newNode;
        } 
        else 
        {
            temp.next = newNode;
            temp = newNode;
        }
    }
    public int cmp_list(Node l1,Node l2)
    {
        while (l1 != null && l2 != null) 
        {
            if (l1.data != l2.data) {
                return 0; 
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null) 
        {
            return 1; 
        }
        return 0;
    }
    public void display()
    {
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data+"\n");
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList1 l1 = new SinglyLinkedList1();
        SinglyLinkedList1 l2 = new SinglyLinkedList1();
        System.out.println("First list: ");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) break;
            l1.insertNode(num);
        }
        System.out.println("Second list: ");
        while (true) 
        {
            int num = s.nextInt();
            if (num == -1) break;
            l2.insertNode(num);
        }
        System.out.print("list 1: ");
        l1.display();
        System.out.print("list 2: ");
        l2.display();
        int result = l1.cmp_list(l1.head, l2.head);
        if (result == 1) 
        {
            System.out.println("1");
        } else 
        {
            System.out.println("0");
        }
    }
}