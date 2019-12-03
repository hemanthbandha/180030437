import java.lang.*;
import java.util.*;
class P25
{
public static void main(String args[])
{
char a;
Scanner sc=new Scanner(System.in);
a=sc.next().charAt(0);
if(Character.isLetter(a))
System.out.println("character");
else if(Character.isDigit(a))
System.out.println("digit");
else 
System.out.println("spl char");
}
}