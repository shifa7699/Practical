// Final keyword ---> Cannot change the value of the final variable throughout the code
//Use of Final variable

public class FinalVariable 
{
	final int value=50; //final variable
	void display()
	{
		System.out.println(value);
		// The value can't be changed as it is declared as final
		//If we write value=70, then we'll get a compilation error
	}
	public static void main(String args[])
	{
		FinalVariable fv=new FinalVariable();
		fv.display();
	}
}
