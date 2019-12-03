import java.util.*;
class P214
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,c,i;
n=sc.nextInt();
c=0;
for(i=2;i<=n/2;i++)
{	if(n%i==0)
		c=1;
}
if(n==0||n==1)
System.out.println(n+" is neither and nor a prime");
else if(c==0)
System.out.println(n+" is a prime");
if(c==1)
System.out.println(n+" is not a prime");
}
}

