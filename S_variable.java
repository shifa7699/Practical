class Staticvariable1
{
int rollno;
String name;
float fee;
static String college="SRM";
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
class Staticvariable
{
public static void main(String args[])
{
Staticvariable1 s1=new Staticvariable1(111,"Pallabi",5000);
Staticvariable1 s2= new Staticvaiable1(555,"Amit",6000);
s1.display();
s2.display();
}
}
}