package rammohan;

public class thread {
	public static void main(String [] args) {
		
		try {
		String input = args[0];
		System.out.println("input:"+input);
		int output =Integer.parseInt(input);
		System.out.println("output:"+output);
		}catch(ArrayIndexOutOfBoundsException e) {
			
		}
		
	}

}
