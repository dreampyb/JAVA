package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex1 {

	public static void main(String[] args) {
		File file = new File("c:/work/sample.dat");		
		// 파일 읽기
//		try {
//			InputStream is =new FileInputStream(file);
//			try {
//				is.read();
//			} catch (IOException e) {
//      e.printStackTrace();
//			} // char값이 리턴이 되고 다읽으면 -1을 리턴해 준다.
//		} catch (FileNotFoundException e) {
//     위에 구문은 중복되는 부분이 있어서 아래와 같이 표현해 줄 수 있다.		
		InputStream is=null; 
		// InputStream 이 try안에 있어서밖으로 꺼내주고 아무것도 없다는 null을 넣어준다
		try {
			 is =new FileInputStream(file); 
			 
			int ch=is.read();  // ch값이 리턴이 되고(1byte씩)  다 읽으면 -1을 리턴해 준다.
			// is 라는 객체는 read를 통해 읽어낸다.
			
//			int ch;
//			do {
//				ch=is.read();
//				System.out.println((char)ch);
//			}while(ch!=-1);
//			}으로도 표현 ㄱ능.
			
			System.out.println((char)ch);
			} catch (IOException e) {
				System.out.println("에러발생");
				e.printStackTrace();
			}finally {
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