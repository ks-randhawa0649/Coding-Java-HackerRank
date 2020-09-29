import java.util.*;

class stack_linkedlist{

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

public Node top = null;


public void push(int data)
{
Node temp = new Node(data);

if(top==null)
{
temp.next = null;
top = temp;
}

else
{
Node prev = top;
while(prev.next!=null && temp.data<prev.next.data)
prev = prev.next;

temp.next=prev.next;
prev.next=temp;
}
}

public void pop()
{
if(top==null)
{
System.out.println("The list is empty");
}

{
System.out.println("Popped element : "+top.data);
top = top.next;
}
}



public void peek()
{
if(top==null)
{
System.out.println("List is empty!");
}
else
{
System.out.println("Peek : "+top.data);
}
}


public void display()
{
if(top==null)
{
System.out.println("Stack is empty");
}
else
{
Node current = top;
while(current!=null)
{
System.out.print(" "+current.data);
current=current.next;
}
System.out.println();
}
}



public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
stack_linkedlist ob = new stack_linkedlist();
ob.push(9);
ob.push(47);
ob.push(12);
ob.push(4);
ob.push(89);
System.out.println("Sorted Linked list:");
ob.display();
}
 
}