//Usage of super keyword
//Refer immediate parent class constructor

class Shape2 // Parent class
{
	Shape2() //Parent class constructor
	{
		System.out.println("Hello");
	}
}
class Size2 extends Shape2 // Child class
{
	Size2() // Child class constructor
	{
		super(); // Invoke immediate parent class constructor of line no.6
		System.out.println("Hi");
	}
}
public class superCons 
{
	public static void main(String args[])
	{
		Size2 obj=new Size2();
	}
}
