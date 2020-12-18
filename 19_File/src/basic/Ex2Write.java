package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex2Write {

	public static void main(String[] args) {
		// 파일쓰기
		File file = new File("c:/work/sample.dat");
		OutputStream is=null;
		byte[] data= {64,'A','B','C','D'};
		
		try {
			is = new FileOutputStream(file); //true면 추가하기, 생략은 덮어쓰우기
			is.write(data,1,2);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
