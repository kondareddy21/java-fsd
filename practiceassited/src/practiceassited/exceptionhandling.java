package rammohan;

import java.util.Scanner;

class exceptionhandling {
		  public static void main(String[] args) {
		 
		  int a, b, result;
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter the first element:");
		 
		  a = input.nextInt();
		  
		  System.out.println("Enter the second element:");
		  b = input.nextInt();
		 
		  // try block
		 
		  try {
		    result  = a / b;
		    System.out.println("Result = " + result);
		  }
		 
		  // catch block
		 
		  catch (ArithmeticException e) {
		    System.out.println("Exception caught: Division by zero."+e);
		  }
	}
}


