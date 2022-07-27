package practiceassited;

class ram{
	ram(){
		System.out.println("zero argument passed");
	}
	ram(String a,String b){
		String x=a;
		String y=b;
		System.out.println("i love "+x+" and "+y);
	}
	
}
public class paraconstructor {
	public static void main(String args[]) {
		ram r=new ram();
		r=new ram("bmw","audi");
	}

}
