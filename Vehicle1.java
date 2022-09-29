

class Vehicle {//parent class A
	void running()
	{
		System.out.println("Running mode on");
	}
	}
class Bike extends Vehicle {
	void run()
	{
		System.out.println("Bike run mode on");
	}}
public class Vehicle1 {
	public static void main(String args[]) {
		Bike d= new Bike();//Object of child class bike
		d.run();
		d.running();
	}
}
