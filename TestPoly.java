class Bank1
{
	float rateofInterest()
	{
		return 0;
	}
}
class Axis extends Bank1
{
	float rateofInterest()
	{
		return 2.3f;
	}
}
class Sbi extends Bank1
{
	float rateofInterest()
	{
		return 5.4f;
	}
}
class Icici extends Bank1
{
	float rateofInterest()
	{
		return 5.4f;
	}
}

public class TestPoly {
	public static void main(String args[])
	{
		Bank obj; // UPCASTING
		obj=new Axis();
		System.out.println("Axis"+obj.rateofInterest());
		obj=new SBI();
		System.out.println("SBI"+obj.rateofInterest());
		obj=new ICICI();
		System.out.println("ICICI"+obj.rateofInterest());
	}

}
