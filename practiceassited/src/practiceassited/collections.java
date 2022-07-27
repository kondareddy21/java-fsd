package practiceassited;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class collections {
	public static void main(String args[]) {
		System.out.println("Arraylist");
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("ram moahn");
		s1.add("siri");
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		System.out.println("linked list");
		LinkedList<String> l=new LinkedList<String>();
		l.add("hi hello this ram");
		l.add("hi hello this siri");
		Iterator itr=l. iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(100);
		h.add(200);
		h.add(5000);
		h.add(650000);
		System.out.println(h);
		
		
	}

}
