import java.util.*;
class P215
{
public static void main(String args[])
{
int n,i,sum;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
sum=0;
while(n!=0)
{
	i=n%10;
	sum=sum+i;
	n=n/10;	
}
System.out.println("the sum is "+sum);
}
}