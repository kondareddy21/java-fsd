package emailvalid;

import java.util.ArrayList;
import java.util.Scanner;

public class validemail {
	public static void main(String args[]) {
		//String name=null;
		 //final String name="\uD83D\uDE03";
		//String y=Character.toString(128_512);
		ArrayList<String> emailids = new ArrayList<String>();
		emailids.add("rammohan@gmail.com");
		emailids.add("simhamram@gmail.com");
		emailids.add("sadakvali@gmail.com");
		emailids.add("siri@gmail.com");
		emailids.add("maharshi@gmail.com");
		
		    Scanner sc = new Scanner(System.in);
		    System.out.println("enter your email id");
			String ids=sc.nextLine();
			
			if(emailids.contains(ids))
			{
				System.out.println("your email id is successfully " + ids +" found");
				//break;
			}
			else {
				System.out.println("your email id "+ids+" not found");
				//break;
				}
		}

	
}


