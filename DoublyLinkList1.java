import java.util.*;
public class DoublyLinkList1 {
	
	class Node{ 
        Node prev;
        int data;    
        Node next;
       
        public Node(int data) {
            this.prev = null;
            this.data = data;    
            this.next = null;    
        }    
    }
	
	
//Represent the doubly linked list    
    public Node first = null; 
    public Node last = null; 
    
    //insert at end in DLL

    public void insertEnd(int data)
    { //Create a new node    
        Node temp = new Node(data);
        
        //Checks if the list is empty
	if(first==null)
	{
		first=temp;
		last=temp;
	}
	else
	{
		last.next=temp;
		temp.prev=last;
		last=temp;
	}    
        
    }
    
  
    
    
    public void disp_forward()
    {
    	 Node current = first;    
         
	        if(current == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list in forward: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
    }
    
    public void disp_backward()
    {
    	
    	Node current = last;    
        
        if(current == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list in backward: ");    
        while(current != null) {    
            //Prints each node by incrementing pointer    
            System.out.print(current.data + " ");    
            current = current.prev;    
        }    
        System.out.println();  
    }
    

    

    
	public static void main(String[] args) {
		int i=0;
                DoublyLinkList1 ob = new DoublyLinkList1();
                Scanner sc = new Scanner(System.in);
                String s =  sc.nextLine();                  		
		for(i=0;i<s.length();i++)
                {
                char a = s.charAt(i);
                int n = Integer.parseInt(String.valueOf(a));
                ob.insertEnd(n);               
                }
		
		ob.disp_forward();
		ob.disp_backward();
				
	}

}