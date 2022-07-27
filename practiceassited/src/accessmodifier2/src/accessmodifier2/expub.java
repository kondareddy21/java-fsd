package accessmodifier2;
import accessmodifier.expub1;
class sri {
	 public void display1() {
		 System.out.println("hii hello this is ram mohan");
	 }
 }

public class expub  {
	public static void main(String args[]) {
		sri s=new sri();
		expub1 obj=new expub1();
		obj.display("mohan");
		s.display1();
	}

}
