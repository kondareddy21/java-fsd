package rammohan;

class customexception {
	
	
	  static void ram() throws ArithmeticException
	  {  
	    System.out.println("Inside ram function");
	    throw new ArithmeticException("hi hello how are you.............!");
	  }

	  public static void main(String args[])
	  {
	    try
	    {
	      ram();
	    }
	    catch(ArithmeticException e){
	      System.out.println("caught" + e);
	    }
	    finally
	    {
	      System.out.println("finally block is  executed.");
	    }
	  }
	}

