package practiceassited;

class overloding{
	public void ram(int a,int b) {
		int res=a*b;
		System.out.println("multiplication of two number:"+res);
	}
	public void ram(int c,double d) {
		double res=c+d;
		System.out.println("addition of two number"+res);
	}
	
}
public class methodoverloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloding ol=new overloding();
		//overloding ol1=new overloding();
		ol.ram(2, 6);
		ol.ram(5, 10.2);

	}

}
