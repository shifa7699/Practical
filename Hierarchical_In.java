//Hierarchical Inheritance
class vehicle1 {//Parent class A
	void running()
	{
		System.out.println("Running mode on");
	}
}
class Car1 extends vehicle1 {//Child class B
	void run()
	{
		System.out.println("Bike run mode on");
	}
}
class Bike1 extends vehicle1 {//Child class C
	void speed()
	{
		System.out.println("Car speed is very high");
	}
}

public class Hierarchical_In {
	public static void main(String args[])
	{
		Bike1 b= new Bike1();
		b.running();
		b.speed();
		Car1 c= new Car1();
		c.running();
		c.run();
	}

}
