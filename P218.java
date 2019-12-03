import java.util.*;
class P218
{
public static void main(String args[])
{
int n,r,rn=0,n1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
n1=n;
while(n != 0)
    {
        r = n%10;
        rn = rn*10 + r;
        n /= 10;
    }
if(rn==n)
System.out.println(n1+ " is a palindrome");
else
System.out.println(n1+ " is not a palindrome");

}
}