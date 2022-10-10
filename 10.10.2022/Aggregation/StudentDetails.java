
public class StudentDetails {
	int id;
	String name;
	StudentAddress address; //reference entity
	public StudentDetails(int id,String name,StudentAddress address)
		{
			this.id=id;
			this.name=name;
			this.address=address;
		}
		void show()
		{
			System.out.println(id+" "+name);
			System.out.println(address.area+""+address.city+""+address.district);
		}
		public static void main(String args[])
		{
			StudentAddress a1=new StudentAddress("Newtown","Asansol","Paschim Bardhaman");
			StudentDetails d1=new StudentDetails(1,"Shifa",a1);
			d1.show();
		}
}
