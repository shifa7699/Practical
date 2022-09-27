class parameterizedcons
{
int age;
String name;
//Parametrized constructor where we have to pass the parameter
parametrizedcons(int a,String n)
{
age=a;
name=n;
}
void show()
{
System.out.println(age+" "+name);
}
public static void main(String[] args)
{
parameterizedcons d=new parametrizedcons(50,"Karan");
parameterizedcons d1=new parametrizedcons(25,"Rohit");
d.show();
d1.show();
}
}

