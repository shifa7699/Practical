package exception;
 // invoked method on the null object 
public class NullPointer 
{
	String str=null;   ///String null value
	int arr[]=null;  //array object null
	String convert (String s) 
	{
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		NullPointer obj= new NullPointer();
		System.out.println(obj.convert(null));
		System.out.println(obj.arr.length);
		System.out.println(obj.str.equals("Shifa"));
	}
}
