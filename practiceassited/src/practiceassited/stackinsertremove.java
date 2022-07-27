package practiceassited;

import java.util.Scanner;
import java.util.Stack;

public class stackinsertremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer> rs=new Stack<>();
		System.out.println("Initial stack : "  + rs);
        System.out.println("Is stack Empty? : "  + rs.isEmpty());
        rs.push(10);
        rs.push(20);
        rs.push(30);
        rs.push(40);
        System.out.println("Stack after push operation: "  + rs);
        System.out.println("Element popped out:"  + rs.pop());
        System.out.println("Stack after Pop Operation : "  + rs);
        System.out.println("enter element for searching:");
        int a=sc.nextInt();
        System.out.println("Element 10 found at position: "  + rs.search(a));
        System.out.println("Is Stack empty? : "  + rs.isEmpty());
		

	}

}
