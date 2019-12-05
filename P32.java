import java.lang.*;
class P32
{
public static void main(String args[])
{
int a[]={90,20,30,40};
int n=a.length;
int max,min,i;
 max=a[0];
  min=a[0];
for(i=1;i<n;i++)
{ 
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("the max is "+max+" min is "+min);
}
}
