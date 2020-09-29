import java.util.*;
public class DoublyLinkList1Add {
	
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
    
  
    
  



    public void insertBeg(int data)
    {
    if(first!=null)
    {  
    int c;
    c = first.data;
                while(c>=10)
                {
                 c = c - 10;
                 data = data + 1;
                }
        first.data = c;
   }
        Node temp = new Node(data);
        
        //Checks if the list is empty
	if(first==null)
	{
		first=temp;
		last=temp;
	}
	else
	{

		temp.next=first;
		first.prev=temp;
		first=temp;
	}    
     temp = null;
        
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
		int i,n;
                char a;
                String s;
                DoublyLinkList1Add ob1 = new DoublyLinkList1Add();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter first LL");
                s =  sc.nextLine();                  		
		for(i=0;i<s.length();i++)
                {
                a = s.charAt(i);
                n = Integer.parseInt(String.valueOf(a));
                ob1.insertEnd(n);               
                }
                 
                ob1.disp_forward();                

  
               		
                DoublyLinkList1Add ob2 = new DoublyLinkList1Add();

                System.out.println("Enter Second LL");
                s =  sc.nextLine();                  		
		for(i=0;i<s.length();i++)
                {
                a = s.charAt(i);
                n = Integer.parseInt(String.valueOf(a));
                ob2.insertEnd(n);               
                }

                ob2.disp_forward();
                 
             

                DoublyLinkList1Add ob3 = new DoublyLinkList1Add();

                Node current1 = ob1.last;
                Node current2 = ob2.last; 
                int d; 
                while(current1!=null)
                {
                d = current1.data + current2.data;
                ob3.insertBeg(d);
                current1 = current1.prev;
                current2 = current2.prev;
                }   
                current1 = null;
                current2 = null;    

                 
                System.out.println("LL obtained after adding two linked lists:\n");
                ob3.disp_forward();
				
	}

	}