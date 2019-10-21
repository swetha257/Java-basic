package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("File Demo Example");
		try {
			
//			FileInputStream f=new FileInputStream("C:\\Users\\Sweth\\Desktop\\FileDemo.txt");
//			FileOutputStream o=new FileOutputStream("C:\\Users\\Sweth\\Desktop\\File1.txt");
			FileReader f=new FileReader("C:\\Users\\Sweth\\Desktop\\FileDemo.txt");
			FileWriter o=new FileWriter("C:\\Users\\Sweth\\Desktop\\File3.txt");
			int  str;
			while((str =f.read())!=-1) {
				System.out.println("in file"+str);
				o.write(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
