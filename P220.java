import java.util.*;
import java.lang.*;
class P220
{
    public static void main(String[] args)
   {
         Scanner sc=new Scanner(System.in);
         char s;
        do
        {
               System.out.println("1. Add\t2.Sub\t");
              System.out.print("Enter Your Choice : ");
              int choice=sc.nextInt();
              switch(choice)
              {
                   case 1: System.out.print("Enter 1st Value : " );
                                  int a=sc.nextInt();
                                  System.out.print("Enter 2nd  Value : ");
                                  int b=sc.nextInt();
                                  System.out.println("Sum is "+(a+b));
                                  break;
                     case 2: System.out.print("Enter 1st Value : ");
                                  int c=sc.nextInt();
                                  System.out.print("Enter 2nd  Value : ");
                                  int d=sc.nextInt();
                                  System.out.println("sub is "+Math.abs(c-d));
                                  break;
              }
              System.out.print("Do You Wish To Continue : ");
               s=sc.next().charAt(0);
                                  
          }while(s=='Y' || s=='y') ;      
   }
}