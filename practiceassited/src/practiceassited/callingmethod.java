package practiceassited;

class methodstatic{
	static void ram() {
		System.out.println("I am inside the ram() method and i am going to call siri method");
		siri();
	}
	static void siri() {
		System.out.println("I am inside the siri() method i am going to call happy method");
		happy();
	}
	static void happy() {
		System.out.println("I am calling happy() method");
	}
}

public class callingmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodstatic s=new methodstatic();
		s.ram();

	}

}
