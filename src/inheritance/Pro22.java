package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pro22{

	public static void main(String[] args) {
		
	String input="Hello World!";
	String pattern="\\b(\\w+)\\b";
	Pattern p=Pattern.compile(pattern);
	Matcher m=p.matcher(input);
	
	int count=0;
	while(m.find()) {
		count++;
	}
	System.out.println(count);
	}
		
}
