import java.util.*;
class user_stack
{

int arr[] = new int[10];
static int top=-1;

public void push(int data)
{

if(top>=10)
{
System.out.println("List is full");
}
else
{
top++;
arr[top]=data;
}

}

public void pop(int w)
{
if(top!=-1 && w==1)
{
System.out.print(arr[top]);
top--;
}
else if(top==-1)
{
System.out.println("List underflow");
}
else if(top!=-1 && w==2)
{
switch(arr[top])
{
case 10:	
System.out.print('A');
break;
case 11:
System.out.print('B');
break;
case 12:
System.out.print('C');
break;
case 13:
System.out.print('D');
break;
case 14:
System.out.print('E');
break;
case 15:
System.out.print('F');
break;
default:
System.out.print(arr[top]);
}
top--;
}
}

public static void main(String[] args)
{
int n=0 , r=0 , num;
Scanner sc = new Scanner(System.in);
user_stack ob = new user_stack();
System.out.println("Enter a decimal number");
num = sc.nextInt();
n=num;
while(n!=0)
{
r = n%2;
ob.push(r);
n = n/2;
}

System.out.println("Binary form :");

while(top!=-1)
{
ob.pop(1);
}

n=num;

while(n!=0)
{
r=n%8;
ob.push(r);
n=n/8;
}

System.out.println("\nOctal form :");

while(top!=-1)
{
ob.pop(1);
}

n=num;

while(n!=0)
{
r = n%16;
ob.push(r);
n=n/16;
}


System.out.println("\nHexadecimal form :");

while(top!=-1)
{
ob.pop(2);
}


}

}