package practiceassited;

import java.util.Scanner;

public class rotatearray {
	public static void main(String args[]) {
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
		System.out.println("\nEnter the number of times the array needs to be rotated right");
        int r = sc.nextInt();
        for(int j=0;j<r;j++) 
        {
        	int x=arr[s-1];
        	for(int i=s-1;i>0;i--)
        	{
        		arr[i]=arr[i-1];
        	}
        	arr[0]=x;
        }
        System.out.println(" ");
        System.out.println("right rotated array");
        for(int i=0;i<s;i++)
        {
        	System.out.print(arr[i]+" ");
        }
		
}
}
