abstract class A{
	abstract void add(int a, int b);
	abstract void mul(int a, int b);
}

class B extends A{
	public void add(int x, int y) {
		System.out.println("Sum: " +(x + y));
	}
	public void mul(int x, int y) {
		System.out.println("Multiply: " +(x * y));
	}
}
public class AbstractionEx1 {

	public static void main(String[] args) {
		B c = new B();
		
		c.add(10, 20);
		c.mul(10, 20);
	}
}
