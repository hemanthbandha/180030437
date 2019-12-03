import java.util.*;
class P213
{
public static void main(String args[])
{
int i,j,f;
for(i=10;i<=99;i++)
{	f=0;
	for(j=2;j<i/2;j++)
	{ 
		if(i%j==0)
		{	f=1;
			break;
		}
	
	}
	if(f==0)
	System.out.println(i);
}
}
}