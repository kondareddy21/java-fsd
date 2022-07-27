package practiceassited;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexperssion {
	public static void main(String args[]) {
		// print only the uppercse letter in the string
		String regex = "\\b\\p{javaUpperCase}+\\b";
		String s="RAM and SIRI both are good FRIENDS and  we are good couples";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(s);
		 while (matcher.find()) {            
		        System.out.println(matcher.group());
		    }
		 
		
	}

}
