import java.util.*;

class s1linkedlist{

class Node
{
int data;
Node next;

public Node(int data)
{
this.data=data;
this.next = null;
}

}

public Node head = null;

public void insertbeg(int data)
{
Node temp = new Node(data);
if(head==null)
{
head = temp;
}
else
{
temp.next = head;
head = temp;
}
}

public void insertend(int data)
{
Node temp = new Node(data);
Node last = head;
if(head==null)
{
head = temp;
}
else
{
while(last.next!=null)
{
last = last.next;
}
last.next = temp;
}

}

public void deletionbeg()
{
if(head==null)
{
System.out.println("The list is empty");
}
else
{
Node temp = head;
head = head.next;
temp = null;
}
}

public void deletionend()
{
if(head==null)
{
System.out.println("List is empty");
}
else
{
Node seclast = head;
while(seclast.next.next!=null)
{
seclast = seclast.next;
}
Node last = seclast.next;
seclast.next = null;
last = null;
}
}

public void display()
{
if(head==null)
{
System.out.println("List is empty");
}
else
{
Node current = head;
while(current!=null)
{
System.out.println(current.data);
current=current.next;
}
System.out.println();
}
}

public void middle()
{
Node current1 = head;
Node current2 = head;
while(current1.next!=null)
{
current1=current1.next.next;
current2=current2.next;
}
System.out.println("Middle Element is : "+current2.data);
}



public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
s1linkedlist ob = new s1linkedlist();
ob.insertbeg(2);
ob.insertbeg(4);
ob.insertbeg(7);
ob.insertbeg(9);
ob.insertbeg(15);
ob.display();
ob.middle();

}
 
}