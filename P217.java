import java.util.*;
class P217
{
public static void main(String args[])
{
int n,r,rn=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n != 0)
    {
        r = n%10;
        rn = rn*10 + r;
        n /= 10;
    }
System.out.println(rn);
}
}