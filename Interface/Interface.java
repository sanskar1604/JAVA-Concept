// If you have only one abstract method in interface then it is called Functional Interface.

interface ParentInterface{
	String s = "DXC";	//public, static and final for the variables.
	void display(); //Abstract methods do not specify a body
						//Method is public abstract
	
	static void disp() {
		System.out.print("Inside static method");
	}
	
	default void print() {
		System.out.print("Inside default method");
	}
}

//Marker Interface
interface Parent2 extends ParentInterface{	//Interface to interface using extends keyword
	
}

class ChildInterface implements ParentInterface, Parent2{	//class to interface using implements
	public void display() {
		System.out.println(s);
		System.out.print("Inside Child Class");
	}

	
}
public class InterfaceEx1 {

	public static void main(String[] args) {
		
		ChildInterface obj1 = new ChildInterface();
		
//		ChildInterface obj2 = new ParentInterface();
		
		ParentInterface obj3 = new ChildInterface();
		
		System.out.println(obj1.s);
		obj1.display();

	}

}
