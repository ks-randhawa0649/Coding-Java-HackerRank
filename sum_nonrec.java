import java.util.*;
import java.lang.Math;
public class sum_nonrec
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double n = sc.nextInt();
sum_it(n);
}

public static double sum_it(double n)
{
int i;
double sum=0;
for(i=1;i<=n;i++)
{
sum = sum + Math.pow(i,i)/(i+1); 
}
System.out.print(sum);
return 0;
}


}

