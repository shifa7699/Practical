package pack.com;

import java.util.ArrayList;

public class Unboxing2 
{
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		//autoboxing
		a1.add(5);
		a1.add(2);
		System.out.println("ArrayList: "+a1);
		//Unboxing
		int a=a1.get(0); //5 Integer convert to int
		int b=a1.get(1); //2 Integer convert to int
		System.out.println("Value of index 0: "+a+" and value of index 1: "+b);
	}
}
