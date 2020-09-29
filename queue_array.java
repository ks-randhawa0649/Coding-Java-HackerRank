class queue_array
{
int arr[]=new int[5];
int f=-1,r=-1;

void insert(int data)
{
if(f==r && f=-1)
{
f=0;
r=0;
arr[r]=data;
}
else
{
r++;
arr[r]=data;
}
}

void delete()
{
if(f==r)
{
f=-1;
r=-1;
}
else
{
f++;
}
}

void display
{
if(f==r && f=-1)
{
System.out.println("List is empty");
}
else
{
int i=f;
while(i<=r)
{
System.out.print(arr[i]+" ");
i++;
}
}
}

public static void main(String args[])
{
queue_array ob = new queue_array();
ob.insert(1);
ob.insert(2);
ob.insert(3);
ob.insert(4);
ob.insert(5);
ob.display();
}


}