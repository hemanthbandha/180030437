import java.util.*;
class P24
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char A,B;
A=sc.next().charAt(0);
B=sc.next().charAt(0);
if((int)A>(int)B)
System.out.println(B+","+A);
else 
System.out.println(A+","+B);
}}