package practiceassited;

class threadrunable implements Runnable {
	public void run() {
		ram();
		siri();
	}
	void ram() {
		System.out.println("Hi.. hello ram.....! ");
	}
	void siri() {
		System.out.println("Hi.. hello siri.....!");
		
	}
	public static void main(String args[]) {
		threadrunable tr=new threadrunable();
		Thread t1=new Thread(tr);
		t1.start();
	}

}

