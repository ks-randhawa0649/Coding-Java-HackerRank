import java.util.*;
class nge{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n=0,l=0,i=0,j=0;
System.out.println("Enter number of elements");
n=sc.nextInt();

int arr[] = new int[n];
int g[] = new int[n];
System.out.println("Enter elements");

for(i=0;i<n;i++)
arr[i]=sc.nextInt();

g[n-1]=-1;

for(i=n-2;i>=0;i--)
{
l=-1;
 
if(arr[i]<arr[i+1])
l=arr[i+1];
else if(arr[i]>arr[i+1] && arr[i]<g[i+1])
l=g[i+1]; 

g[i]=l;
}

for(i=0;i<n;i++)
System.out.println(arr[i]+" -------> "+g[i]);



}

}

