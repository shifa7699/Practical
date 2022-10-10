//Area of the circle pi*r*r
//Aggregation HAS-A relationship
//We have created the reference entity of aggregation class
class Aggregation {// Class 1
	int square(int r) {
	return r*r;
	}
}
class circle {// class 2
	Aggregation ag; //obj (entity ref)
	double pi=3.14;
	double area(int radius ) {
		ag= new Aggregation();
		int psquare = ag.square(radius);
		return pi*psquare;
	}
	public static void main(String[] args) 
	{
		circle c= new circle();
		double result = c.area(5);
		System.out.println(result);
	}

}

