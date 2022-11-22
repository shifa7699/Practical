package thread;
//directlt we use thread class without extend
public class ThreadEg2 
{
	public static void main(String[] args) {
		Thread t = new Thread("Shifa");
		t.start();
		String s = t.getName();
		System.out.println(s);
	}
}
