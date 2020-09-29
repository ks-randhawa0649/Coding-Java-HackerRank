import java.util.*;
import java.lang.Math;
public class sum_rec
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double n = sc.nextInt();
System.out.print(sum_it(n));
}

public static double sum_it(double n)
{
if(n==0)
return 0;
else
return Math.pow(n,n)/(n+1) + sum_it(n-1);
}

}

