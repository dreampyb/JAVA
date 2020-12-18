package basic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex2WirteTWR {

	public static void main(String[] args) {
		// 파일쓰기
		File file = new File("c:/work/sample.dat");
		byte[] data= {64,'A','B','C','D'};
		//try-with-resources  구문
		try(OutputStream is = new FileOutputStream(file)) {
			 //true면 추가하기, 생략은 덮어쓰우기
			is.write(data,1,2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
