package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex1Read {

	public static void main(String[] args) {
		File file = new File("c:/work/sample.dat");
		//파일읽기
		InputStream is=null;
		try {
			is = new FileInputStream(file);
			
			int ch;
			do {
				ch=is.read();
				System.out.println((char)ch);
			}while(ch !=-1);
			
			//ch 값이 리턴이 되고(1byte씩) 다읽으면 -1을 리턴해준다
			System.out.println((char)ch);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		} finally {
			if(is !=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
