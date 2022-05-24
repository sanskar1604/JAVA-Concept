public class def {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a="Lava";
     String b=new String("Java");
     System.out.println(a.equals(b)); // compare value - true
     System.out.println(a==b); // compares mem addr - false
     System.out.println(a.compareTo(b)); // int - 0 same, +X -a is ahead of b,-X a is lesser than b by X chars
     
	}

}
