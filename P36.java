import java.lang.*;
class P36
{
public static void main(String args[])
{
int a[]={90,1,56,89,94};
int i,j;
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
System.out.println(a[i]);
}
}
}
