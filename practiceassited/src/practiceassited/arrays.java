package practiceassited;



public class arrays {
	static void ram( int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
				System.out.println("min value:"+min);
		}
	}
	public static void main(String args[]) {
		int arr[]= {85,4,8,5};
		ram(arr);
	}

}
