package thread;

public class ThreadEg3 extends Thread
{
	
	public void run()
	{
		for ( int i = 0; i < 5; i++)
		{
			try {
				Thread.sleep(800); }
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadEg3  t=new ThreadEg3();
		ThreadEg3  t1=new ThreadEg3();
		ThreadEg3  t2=new ThreadEg3();
		t.runt();
		t1.run();
		t2.run();
	}
}
