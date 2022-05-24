class Polygon{
	void display() {
		System.out.println("Inside Polygon Class");
	}
}

class Square extends Polygon{
	public void display() {
		System.out.println("Inside Square Class");
	}
}


public class MethodOverridingExample {
	
	public static void main(String[] args) {
		Polygon p1 = new Polygon();
		p1.display();
		
		Square o1 = new Square();
//		o1.display();
		
		Polygon p2 = new Square();	//AutoCasting
		p2.display();
		
//		Square  p3 = (Square) new Polygon();	//Type Casting
//		p3.display();
		
		Square  p4 = (Square) p2;	
		p4.display();
	}
}
