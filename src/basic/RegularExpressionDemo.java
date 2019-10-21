package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {
	public static void main(String[] args) {
		
		String password= "cat cat cat  cat"; //alphne
		String pattern="\\bcat\\b";
		//="(.*)(\\d.*)";
		Pattern p= Pattern.compile(pattern);
		
		Matcher matcher=p.matcher(password);
		
			if(matcher.find()) {
				System.out.print("accepted==>"+matcher.group());
			}
		
		
				
	}
}
