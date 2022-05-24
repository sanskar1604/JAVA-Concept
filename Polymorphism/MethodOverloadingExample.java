class Display{
	public void disp() {
		for(int i = 0; i < 10; i++) {
			System.out.print("* ");
		}
	}
	
	public void disp(String s) {
		for(int i = 0; i < 10; i++) {
			System.out.print(s);
		}
	}
	
	public int disp(int a) {
		return a;
	}
	
	public char disp(char c) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			return c;
		}
		
		return c;
		
	}
	
	public int disp(int a, int b) {
		return a;
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		
		Display o1 = new Display();
		
		o1.disp();
		System.out.print("\n");
		o1.disp('#');
		
		
	}
}
