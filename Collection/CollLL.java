package ourteam;

import java.util.LinkedList;

public class CollLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<>();
		System.out.println("Initialized:"+ll);
		ll.add("Shankar");
		ll.add("Narayan");
		System.out.println("After added elements:"+ll);
		ll.add(1,"Sona");
		System.out.println("After added element with indexed"+ll);
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Avni");
		ll1.add("Mano");
		ll.addAll(ll1);
		System.out.println("After added all element:"+ll);
		LinkedList<String> ll2=new LinkedList<>();
		ll2.add("Jothi");
		ll2.add("Kumar");
		ll.addAll(1,ll2);
		System.out.println("After added all element with indexed:"+ll);
		ll.addFirst(null);
		System.out.println("After added element with addfirst method"+ll);
		ll.addLast("Anik");
		System.out.println("After added element with addlast method"+ll);
		
		
		
	}

}
