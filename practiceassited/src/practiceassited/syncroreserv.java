package practiceassited;

class syncroreserv implements Runnable{
	int avail=1;
	int wanted;
	syncroreserv(int i){
		wanted=i;
	}
	public void run() {
		synchronized(this)
		{
			System.out.println("Available breaths="+avail);
			if(avail>=wanted)
			{
				String str=Thread.currentThread().getName();
				System.out.println(wanted+"Breath reserved for"+str);
				try {
					Thread.sleep(1500);
					avail=avail-wanted;
				}catch(InterruptedException ie) {
			}
		}
		System.out.println("Sorry ,no breaths");
	}
   }

}
class safe{
	public static void main(String args[]) {
		syncroreserv sr=new syncroreserv(2);
		Thread t1=new Thread(sr);
		Thread t2= new Thread(sr);
		t1.setName("ram mohan");
		t2.setName("Siri");
		t1.start();
		t2.start();
	}
}

