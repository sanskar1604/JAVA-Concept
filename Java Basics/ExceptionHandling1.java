public class abs {
 static int k;
  String s=""; // instance variable - default null
  String name="";
  public String getName() {
	  return name;
  }
 public static void main(String[] args)
 {
	 try {
	 String x=null; // local variable
	abs a=null;
	//= new abs();
	try {
 k=10/0;
	 } catch(ArithmeticException e1) {
		 System.out.println("arithmetic");
		 System.out.println(e1.getMessage());
	 }
	// System.out.println(new abs().s.compareTo("Java"));
	// Obj. => null ptr if the objec is null
	 System.out.println( a.getName().equals(null));
	// Obj. => null ptr if the objec is null
	 System.out.println( a.s.equals(null));
	 System.out.println(x);
	 }catch(Exception e) {
		 System.out.println("generic");
		 System.out.println(e.getMessage());
	 }finally {
		 System.out.println("finally");
	 }
	 
 }
 
}

