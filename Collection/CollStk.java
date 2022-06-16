package ourteam;

import java.util.Stack;

public class CollStk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<>();
		st.push("Java");
		st.push("Collection");
		st.push("Framework");
		System.out.println("The elements in the stack:"+st);
		System.out.println("The element at the top:"+st.peek());
		System.out.println("The element popped out of the stack:"+st.pop());
		System.out.println("The elements in the stack after popped out:"+st);
		System.out.println("The result of searching the elements in the stack:"+st.search("red"));
		
		
	}

}
