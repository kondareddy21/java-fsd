package practiceassited;

import java.util.*;
public class mapcollection {
	public static void main(String args[]) {
		HashMap<Integer,String> rs=new HashMap<Integer,String>();
		rs.put(1, "Ram moahn");
		rs.put(2,"siri");
		rs.put(3, "happy");
		rs.put(4, "cute");
		for(Map.Entry r:rs.entrySet()) {
			System.out.println(r.getKey()+":"+r.getValue());
		}
		TreeMap<Integer,String> sr=new TreeMap<Integer,String>();
		sr.put(5,"always be happy");
		sr.put(6, "be with you");
		for(Map.Entry s:sr.entrySet()) {
			System.out.println(s.getKey()+":"+s.getValue());
		}
		
		
	}

}
