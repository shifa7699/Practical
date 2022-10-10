//Base class
 class Teacher 
{
	String designation="Teacher";
	String college_name="BB College";
	void work()
	{
		System.out.println(designation+""+college_name);
	}
}
class ITTeacher extends Teacher
{
	public static void main(String args[])
	{
		Teacher t= new Teacher();
		//ITTeacher t1=new ITTeacher();
		t.work();
	}
}