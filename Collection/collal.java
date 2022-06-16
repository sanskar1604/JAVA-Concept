package ourteam;

import java.util.*;

public class collal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Collection al=new ArrayList(2);
al.add(1);
al.add("Sona");
al.add("Avni");
//System.out.println(al);

Collection<String> al1=new ArrayList<>();
//al1.add(1);
al1.add("Sona");
al1.add("Mano");
//al1.add(2);
//al1.set(1, "Manoharan");
//System.out.println(al1);
//System.out.println(al1.get(0));



List<String> al2=new ArrayList<String>();
al2.add("Sona");
al2.add("Mano");
al2.set(1, "Manoharan");
//al2.remove(0);

//for(String name:al2)
//{
//	if(name.equals("Sona"))
//		al2.remove(name);
//	System.out.println(name);	
//}


Iterator<String> it=al2.iterator();
	
	while(it.hasNext())
{
		String x=it.next();
	if(x.equals("Sona"))
al2.remove(x);
System.out.println(it.next());
}	
//
//System.out.println(al2);
//System.out.println(al2.get(0));


	}

}
