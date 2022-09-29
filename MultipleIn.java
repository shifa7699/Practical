
class Vehicle2 {//Parent class A
	void running()
	{
		System.out.println("Running mode on");
	}
}
class Bike2 extends Vehicle2 {//Child class B
	void run()
	{
		System.out.println("Bike run mode on");
	}
}
class Car2 extends Bike2 {//Child class C
	void speed()
	{
		System.out.println("Car speed is very high");
	}
}
public class MultipleIn {
	public static void main(String args[])
	{
		Car2 d= new Car2();
		d.run();
		d.running();
		d.speed();
	}
}
