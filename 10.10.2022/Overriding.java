// Creating parent class
class TestOverriding {
	void run()
	{
		System.out.println("running mode on");
	}
}
	//Creating child class
	class Overriding extends TestOverriding
	{
		//Defining same name method as its declared in the parent class
	void run()
	{
		System.out.println("Running mode off");
	}
	public static void main(String args[])
	{
		//Creating object of child class
		Overriding a = new Overriding();
		a.run();
	}
}

