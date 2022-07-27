package practiceassited;

class waitandsleep {
	private static Object ob=new Object();
	
	
	
	public static void main(String[] args)throws InterruptedException{
		Thread.sleep(2000);   
        
   
        System.out.println( Thread.currentThread().getName() +" Thread is woken after two second"); 
        
        
        synchronized (ob)    
        {   
              
            ob.wait(2000);   
  
            System.out.println(" Object is in waiting state and woken after 2 seconds");   
        }   
	}
	

}
