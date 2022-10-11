//super keyword --->Reference variable which refers immediate parent class

class Shape // Parent class
{
	String name="Circle"; //data member of parent class
}
class Size extends Shape //Child class
{
	String name="Triangle";// Data member of child class
	void print() // Child class method
	{
		System.out.println("Print Triangle");
		System.out.println(super.name);
	}
}
public class Super1 
{
	public static void main(String args[])
	{
		Size s=new Size();
		s.print();
	}
}
