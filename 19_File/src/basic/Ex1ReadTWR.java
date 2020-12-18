package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex1ReadTWR {

	public static void main(String[] args) {
		File file = new File("c:/work/sample.dat");
		//try-with-resource
		try(InputStream is = new FileInputStream(file)) {
			int ch;
			do {
				ch=is.read();
				System.out.println((char)ch);
			}while(ch !=-1);
			System.out.println((char)ch);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}

	}

}
