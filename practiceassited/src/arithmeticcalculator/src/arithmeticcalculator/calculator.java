package arithmeticcalculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double ele1,ele2,res;
		char oper;
		// enter the user input elements
		Scanner sc =new Scanner(System.in);
		//enter the first element
		System.out.println("enter the first element:");
		ele1=sc.nextDouble();
		//enter the second elements
		System.out.println("enter the second elements:");
		ele2=sc.nextDouble();
		//enter the operand for doing operation
		System.out.println("enter the operand:");
		oper=sc.next().charAt(0);
		 
		switch(oper)
		{
		case '+':
			res=ele1+ele2;
			System.out.println(ele1 + "+" + ele2 + "=" +res);
			break;
		case '-':
			res=ele1-ele2;
			System.out.println(ele1 + "-" + ele2 + "=" +res);
			break;
		case '*':
			res=ele1*ele2;
			System.out.println(ele1 + "*" + ele2 + "=" +res);
			break;
		case '/':
			res=ele1/ele2;
			System.out.println(ele1 + "/" + ele2 + "=" +res);
			break;
		case '%':
			res=ele1%ele2;
			System.out.println(ele1 + "%" + ele2 + "=" +res);
			break;
		default:
			System.out.println("your enter invalid operator");
			break;
		}
		sc.close();
			
	}
		
}
