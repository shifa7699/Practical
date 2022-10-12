//Run time polymorphism ---> method overriding
public class RunTimePoly {
	int value=50;
	void show()
	{
		
		System.out.println("Show Anything");
	}
}
class TestRuntimePoly extends RunTimePoly
{
	int value=70;
	void show()
	{
		System.out.println("Show Nothing");
	}
	//Reference variable of parent class refers to the object of child class
	public static void main(String args[])
	{
		RunTimePoly obj=new TestRuntimePoly();// UPCASTING
		obj.show();
		System.out.println("Value is: "+obj.value);
	}
}
