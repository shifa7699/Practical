
/*class Binding 
{
	private void display() { //Static Binding
			System.out.println("Samjhe???");
		}
		void show()
		{
			System.out.println("Ab samjhe???");
		}
	class Binding
		public static void main(String args[])
		{
			Binding obj = new Binding();
			obj.display();
		}
}*/
class TestBinding
{
void show() //Dynamic Binding
{
System.out.println("ab samjhe??");
}}
class Binding extends TestBinding
{
	void show()
	{
		System.out.println("Override");
	}
	public static void main(String args[])
	{
		TestBinding obj=new TestBinding();
		obj.show();
	}
}
