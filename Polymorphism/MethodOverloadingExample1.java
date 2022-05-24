class A{
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}
	void sum(long a, int b) {
		System.out.println("b method invoked");
	}
}


public class MethodOverloadingExample1 {
	public static void main(String[] args) {
		A obj = new A();
		obj.sum(20, 20);	//Compile Time Error(The method sum(int, long) is ambiguous for the type A).
	}
}
