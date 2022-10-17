package pack.com;

public class VarargsEg 
{
	static void show(String...text)
	{ //using varargs
		for(String s:text) //for ecah loop
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		show(); //Zero arguments
		show("hii"); //one args
		show("I","Love","Coding"); //Three args
	}
}

