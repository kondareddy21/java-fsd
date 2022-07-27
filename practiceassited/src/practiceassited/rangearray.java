package practiceassited;

import java.util.Scanner;

public class rangearray {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//int l,r;
		System.out.println("enter the range from start to end:");
	    int l=sc.nextInt();
	    int r=sc.nextInt();
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
		int sum=0;
		for(int i=l;i<=r;i++) 
		{
			sum=sum+arr[i];
			
		}
		System.out.println("\nsum of elements from given range:");
		System.out.println(sum);
	}

}
