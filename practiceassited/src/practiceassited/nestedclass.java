package practiceassited;

class rams{
	String a="RAM MOHAN";
	public void display() {
		System.out.println("I am in the outer class");
		
	}
	class siri{
		String b= "SIRI";
		public void dis() {
			System.out.println("I am in the inner class");
		}
		
	}
	
	
}

public class nestedclass {
	public static void main(String args[]) {
		rams r=new rams();
		rams.siri rs=new rams().new siri();
		r.display();
		rs.dis();

		System.out.println(r.a+" and "+rs.b+" both are good frinds.......!");
		
		
	}

}
