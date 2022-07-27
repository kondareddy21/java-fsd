package accessmodifier;

import java.lang.reflect.Method;

class Add {
	private void display()
	{
		System.out.println(" this is private method using out side class");
	}
}

public class privateclass1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Add o =new Add();
		// in this below method returns a method object that reflect the specified declared method of the class
		Method m=Add.class.getDeclaredMethod("display", null);
		//in this below method for this object indicate a boolean value
		m.setAccessible(true);
		m.invoke(o);
		

	}

}
