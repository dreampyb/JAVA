package basic;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		Path path1 = Paths.get("c:/work/sample1.txt");
		File file=path1.toFile(); //File 객체로 변환
		

	}

}
