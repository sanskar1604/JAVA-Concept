class Parent {
    final void show() {
	
	}     // Can't be overridden
}
  
class Child extends Parent {
    void show() {
	
	}	//Cannot override the final method from Parent
}

public class MethodOverridingExample1 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.show();
		
		Child c = new Child();
		c.show();
	}
}