package typecasting;

public class tpca {
	public static void main(String args[]) {
		
		
		System.out.println("Widening or Automatic Type Conversion:");
		char ele='R';
		System.out.println("char = "+ele);
		int ele1=ele;
		System.out.println("integer ="+ele1);
		float ele2=ele;
		System.out.println("float ="+ele2);
		double ele3=ele;
		System.out.println("double ="+ele3);
		System.out.println();
		
		
		//explicit type converstion
		System.out.println("Narrowing or Explicit Conversion");
		double d=82.0;
		System.out.println("double value:"+d);
		float f=(float)d;
		System.out.println("float value="+f);
		long l=(long)d;
		System.out.println("long value="+l);
		int i=(int)d;
		System.out.println("int value="+i);
		short s=(short)d;
		System.out.println("short value"+s);
		byte b=(byte)d;
		System.out.println("byte:"+b);
		char c=(char)d;
		System.out.println("char="+c);
		
	}

}
