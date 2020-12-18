package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReadTWR {

	public static void main(String[] args) {
		File file = new File("c:/work/sample.txt"); //경로지정
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));) {
			
			for( String str ;(str=reader.readLine())!=null;   ) {
				
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
