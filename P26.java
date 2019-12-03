import java.util.*;
import java.lang.*;
class P26
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int a=sc.nextInt();
if((s.equals("Female"))&&(a>=1&&a<=58))
System.out.println("Interest is 8.2%");
else if((s.equals("Female"))&&(a>=59&&a<=120))
System.out.println("the interest is 7.6%;");
if((s.equals("male"))&&(a>=1&&a<=60))
System.out.println("Interest is 9.2%");
else if((s.equals("male"))&&(a>=61&&a<=120))
System.out.println("the interest is 8.3%");
}
}