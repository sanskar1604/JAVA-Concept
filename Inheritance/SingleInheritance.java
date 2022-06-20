class Parent{
	public void salary() {
		System.out.println("salary=60000");
	}
	private void dep() {
		System.out.println("Development");
	}
}
class Child extends Parent{
	public void bonus() {
		System.out.println("bonus=5000");
	}
//	public void salary() {
//		System.out.println("salary=100000");
//	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.salary();
		c.bonus();
		
		// TODO Auto-generated method stub

	}

}
