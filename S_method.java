class StaticMethod
{
int rollno;
String name;
float fee;
static String college="SRM";
static void change()//static method to change the value of static variable
{
college="ITC";
}
Staticvariable1(int rollno,String name, float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+fee+" "+college);
}
class StaticMethod1
{
public static void main(String args[])
{
//Calling static method with class name
StaticMethod.change();
//Creating Object
StaticMethod s1=new StaticMethod(102,"Ram",5000)
StaticMethod s2= new StaticMethod(222,"Shyam",6000)
s1.display();
s2.display();
}
}
}