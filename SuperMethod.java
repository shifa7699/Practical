//Usage of super key
//Refer immediate parent class method

class Shape1 //parent class
{
	void print() //Prent class method
	{
		System.out.println("print Circle");
	}
}
class Size1 extends Shape1 //Child class
{
	void print() //Child class method
	{
		System.out.println("Print Triangle");
	}
		void display()
		{
			System.out.println("Print Nothing");
		}
		void show() //Final method
		{
			super.print(); //Refer immediate parent method
			display();
			
		}
	}

public class SuperMethod 
{
	public static void main(String args[])
	{
		Size1 obj= new Size1();
		obj.show();
	}
}
