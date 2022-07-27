package accessmodifier;


class Defalutaccess 
{
	private String name;
	void display(){
		System.out.println("this is defalut access specifier");
	}
	public void display( String name) {
		this.name=name;
		System.out.println("my name is " +name);
	}
}

public class defaccess {
	public static void main(String[] args) {
		Defalutaccess obj=new Defalutaccess();
		obj.display();
		obj.display("RAM");
	}

}
