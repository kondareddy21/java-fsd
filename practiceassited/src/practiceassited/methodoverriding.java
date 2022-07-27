package practiceassited;

class vehicle{

	public void ram() {
		System.out.println("HI HELLO THIS IS RAM MOHAN");
	}
}
class bmw extends vehicle{
	public void ram() {
		super.ram();
		System.out.println("I am buying a bmw car");
	}
}
class honda extends vehicle{
	public void ram() {
		super.ram();
		System.out.println("I am buying a honda car");
	}
}


public class methodoverriding {
	public static void main(String[] args) {
		honda h=new honda();
		bmw b=new bmw();
		h.ram();
		b.ram();
		
	}

}
