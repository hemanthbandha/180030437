import java.util.*;
import java.lang.*;
class P31
{
public static void main(String args[])
{
int sum,avg;
int a[]={1,2,3,4};
int n=a.length;
sum=0;
avg=0;
for(int i=0;i<n;i++)
{
sum=sum+a[i];
avg=sum/n;
}
System.out.println("the sum is "+sum);
System.out.println("the avg is "+avg);
}
}