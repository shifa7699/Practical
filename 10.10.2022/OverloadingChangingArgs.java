//Method Overloading - same name method with different parameters
public class OverloadingChangingArgs {
	static int sum(int a, int b) { //Two arguments
		return a+b; }
	static int sum(int a, int b, int c) { //Three arguments
		return a+b+c;
	}	
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(6, 8));
		System.out.println(OverloadingChangingArgs.sum(5,7,9));
	}

}
