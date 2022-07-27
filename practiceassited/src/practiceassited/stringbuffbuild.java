package practiceassited;

public class stringbuffbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sa="RAM and SIRI both are good friends";
		System.out.println(sa.length());
		//sub string
		System.out.println(sa.substring(0, 12));
		//equals
		String str1="Hello";
		String str2="heldo";
		System.out.println(str1.equals(str2));
		//lower case
		String str3="HELLO";
		System.out.println(str3.toLowerCase());
		//replace
		String str4="RAJS";
		System.out.println(str4.replace("J", "M"));
		
		
		//String builder
		StringBuilder sr=new StringBuilder(sa);
		sr.append(" And also a good behaviour......!");
		System.out.println(sr);
		
		//string buffer
		StringBuffer rs=new StringBuffer(sa);
		rs.reverse();
		System.out.println(rs);
		
		

	}

}
