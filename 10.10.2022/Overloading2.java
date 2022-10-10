
public class Overloading2 {
	static int sum(int a, int b) { //Two arguments
		return a+b; 
		}
	//double type arguments
	static double sum(double a, double b, double c) { //Three arguments
		return a+b+c;
	}	
	public static void main(String[] args) {
		System.out.println(Overloading2.sum(7, 5));
		System.out.println(Overloading2.sum(1.5,3.9,2.4));
	}

}
