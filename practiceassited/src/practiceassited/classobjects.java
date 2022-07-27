package oopspillers;

 class ram{
	static String s1="RAM MOHAN";
	 static String s2="SIRI";
	 static void display()
	 {
		 System.out.println("Hi hello my name is ram moahn:"+s1);
		 
	 }
}
 class siri extends ram{

	 static  void siri1() {
		 System.out.println("Hi hello this is "+s2);
	 }
}

 public class classobjects {
	 public static void main(String []args) {
		 classobjects obj=new classobjects();
		 ram.display();
		 siri.siri1();
	 }

		
	}
	
  

