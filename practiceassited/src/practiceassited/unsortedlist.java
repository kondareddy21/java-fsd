package practiceassited;

import java.util.Arrays;
import java.util.Scanner;

public class unsortedlist {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("enter the array elements");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter original array");
		for(int i=0;i<s;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		int sm=4;
		Arrays.sort(arr); 
		System.out.println("\n4th smallest element in unsorted array:"+arr[sm-1]);
		

	}

}
