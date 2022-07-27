package accessmodifier2;

import accessmodifier.Ram;

class Rams1
{
	protected void dis()
	{
		System.out.println("Hii hello");
	}
}


public class protected2 extends Ram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		protected2 obj =new protected2();
		obj.display();

	}

}
