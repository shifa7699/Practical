package pack.com;
//Create object without new keyword
class AnotherClass //Class
{ //Data members of another class
	String name;
	int age;
}
public class WithoutNew //Class
{
	public static void main(String args[]) //Main method
	{
		try
		{ //Creating objects using newInstance method
			AnotherClass ob1=(AnotherClass) AnotherClass.class.newInstance();
			AnotherClass ob2=(AnotherClass) AnotherClass.class.newInstance();
			AnotherClass ob3=(AnotherClass) AnotherClass.class.newInstance();
			AnotherClass ob4=(AnotherClass) AnotherClass.class.newInstance();
			AnotherClass ob5=(AnotherClass) AnotherClass.class.newInstance();
			
			//Initializing data members of objects
			ob1.name="a ";
				ob1.age=20;
			ob2.name="b ";
				ob2.age=30;
			ob3.name="c ";
				ob3.age=40;
			ob4.name="d ";
				ob4.age=50;
			ob5.name="e ";
				ob5.age=70;
				
				System.out.println("name "+ob1.name+" age "+ob1.age);
				System.out.println("name "+ob2.name+" age "+ob2.age);
				System.out.println("name "+ob3.name+" age "+ob3.age);
				System.out.println("name "+ob4.name+" age "+ob4.age);
				System.out.println("name "+ob5.name+" age "+ob5.age);
		}
		catch(Exception c)
		{
			System.out.println(c);
		}
	}
}
