class Patient
{
String name;
double weight;
double height;
Patient(String name,double weight,double height)
{
this.weight=weight;
this.name=name;
this.height=height;
BMI(weight,height);
}

void BMI(double weight,double height)
{
double b = (weight/(height*height))*703;
System.out.println(b); 
}
}

class Patients
{
public static void main(String args[])
{
Patient p=new Patient("vijay",50.5,5.6);

}
}

