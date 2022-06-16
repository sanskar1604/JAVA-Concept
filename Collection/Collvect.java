package ourteam;

import java.util.Vector;

public class Collvect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec =new Vector<>();
		vec.add("Cat");
		vec.add("Tiger");
		vec.add("Dog");
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec);
		vec.addElement("Rat");
		vec.addElement("Lion");
		vec.addElement("Pig");
		vec.addElement("Rat2");
		vec.addElement("Lion2");
		vec.addElement("Pig2");
		vec.addElement("Rat21");
		vec.addElement("Lion21");
		vec.addElement("Pig21");
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec);
		if(vec.contains("Tiger"))
		{
			
			System.out.println(vec.indexOf("Tiger"));
		}
		else
		{
			System.out.println("Tiger is not present in the collection");
		}
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
	}

}
