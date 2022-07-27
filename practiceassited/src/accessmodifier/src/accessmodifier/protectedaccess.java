package accessmodifier;
class Ram{
	protected void display()
	{
		System.out.println("protected method calling");
	}
}

public class protectedaccess {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Ram r=new Ram();
		r.display();

	}

}
