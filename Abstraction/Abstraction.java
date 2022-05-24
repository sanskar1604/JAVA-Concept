public abstract  class Parent{
	abstract void add(int a, int b);
	abstract void mul(int a, int b);
	
	static void divison() {	// divison Decalred as Static
		System.out.println(10 * 20);
	}
	public static void main(String[] args) {	// This main function is called because it's class is public.
		divison();	// You can call this function without creating instance because divison function is declared as static.
	}

	//method signature - method name,no of arg, type of arg
	
}
abstract  class Parent1{

}
abstract class Child extends Parent //,Parent1	//We can not extends more then one class
{
	String s;
	int i;
	public static void add1(int x, int y) // add1() declared as static.
	{	
		System.out.println("Sum: " +(x + y));
	}
	public  void add(int x, int y) {
		System.out.println("Sum: " +(x + y));
	}
	public void mul(int x, int y) {
		System.out.println("Multiplication: " +(x * y));
	}
	Child(String s, int i){
		System.out.println("inside constr"+s+i);
	}
	public static void main(String[] args) {	// This main function is not called because it's class is not defined as public.
		add1(3,5);	// You can call this function without creating instance because add1 function is declared as static.
		//c.add(3,5);
		
		
	}
}

/* class AbstractionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Parent p1 = new Parent();	// We can not create object
		Parent p1 = new Child();	
		Child c1 = new Child();
		p1.divison();
		c1.add(10, 20);
		c1.mul(100, 20);
	}*/


