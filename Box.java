import java.util.*;
class Box
{
double width,height,depth;
Box(double width,double height,double depth){
this.width=width;
this.height=height;
this.depth=depth;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double wi=sc.nextDouble();
double de=sc.nextDouble();
double he=sc.nextDouble();
Box b=new Box(wi,he,de);
double r=b.vol(b.width,b.height,b.depth);
System.out.println("the volume of box "+r);
}
double vol(double width,double height,double depth)
{

return (width*depth*height);
}
}