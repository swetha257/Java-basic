package basic;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader s=new InputStreamReader(System.in);
		char c;
		System.out.println("please enter your character" );
		do {
			 c=(char) s.read();
			System.out.print(c);
		}while(c!='q');
		
	}
}
