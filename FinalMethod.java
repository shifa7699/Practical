// Final keyword ---> Cannot change the value of the final variable throughout the code
//Final method ---> Cannot override the final method

public class FinalMethod 
{
	//Create a final method
	final void display()
	{
		System.out.println("This is a final method");
	}
	/*class main extends FinalMethod
	 * {
	 //Try to override final method
	 public final void display()
	 {
	 System.out.println("The final mrthod is overriden");
	 }*/
	 
	public static void main(String args[])
	{
		FinalMethod obj=new FinalMethod();
		obj.display();
	}
}
