package accessmodifier;
 class Rams{
	public String name;
	public void display(String name)
	{
	   System.out.println("my name is RAM "+name);
	}
	
}

public class publicaccess {
	public static void main(String args[]) {
		Rams ac = new Rams();
		ac.display("Mohan");
	}

}
