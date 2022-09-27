class Copycons
{
int age;
String name;
Copycons(int a,String n)
{
age=a;
name=n;
}
/*Copycons(Copycons c)
{
age=c.age;
name=c.name;
}*/
void show()
{
System.out.println(age+" "+name);
}
public static void main(String args[])
{
Copycons c1=new Copycons("22","Pallabi");
Copycons c2=new Copycons(c1);
c2.age=c1.age;
c2.name=c1.name;
//Copycons c2=new Coopycons();
c1.show();
c2.show();
}
}