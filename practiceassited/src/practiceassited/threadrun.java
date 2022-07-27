package practiceassited;
class threadrun implements Runnable{
	public void run() {
		System.out.println("SIRI");
	}
	public static void main(String args[]) {
		threadrun rn=new threadrun();
		Thread t1=new Thread(rn);
		t1.start();
	}
	
}

