public class deletenode {

	 class Node{    
	        int data;    
	        Node next;    
	            
	        public Node(int data) {    
	            this.data = data;    
	            this.next = null;    
	        }    
	    }    
	//Represent the head of the singly linked list    
	    public Node head = null; 
	    
	  //display() will display all the nodes present in the list    
	    
	    
	    
	    
	    public void display() {    
	        //Node current will point to head    
	        Node current = head;    
	            
	        if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of singly linked list: ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.print(current.data + " ");    
	            current = current.next;    
	        }    
	        System.out.println();    
	    }
	    
	    
	    
	    
	    
	    public void delete(int pos)
	    {   int i;    
	        Node current = head;  
	        if(head == null) {    
	        System.out.println("List is empty");
                return; 
	        }
	        for(i=0;i<pos;i++){
                current = current.next; }
                Node pev = current.prev;
                Node nex = current.next;
                pev.next = nex;                 
	    }
	    
	    
	   
	    
	public static void main(String[] args) {
                int t=0,i=0,num=0,n=0,j=0;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of testcases");
                t = sc.nextInt();
                for(i=0;i<t;i++)
                {
		deletenode ob = new deletenode();
                System.out.println("Enter number of elements in list");
                n = sc.nextInt();
                System.out.println("Enter elements");
                for(j=0;j<n;j++)
                {
                num = sc.nextInt();
                ob.insertBefore(num);
		}
                System.out.println("Enter node position you want to delete");
                p = sc.nextInt();
                ob.delete(p);
                ob.display();
                }
        
		
	}

}