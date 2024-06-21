package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 문자를 써서 저장하는 클래스는 FileWriter클래스이다.
		 * 2. 2바이트 단위로 처리하기 때문에 한글 쓰깅 적합하다
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello2.txt";
		
		Writer rw = null;
		try {
			rw = new FileWriter(path);			
			rw.write("오늘은 6월 4일입니다.\n 집에 가고 싶다"); // 문자를 바로 쓸 수 있음 -> write()를 쓰면 한 번에 출력됨
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				rw.close();
			} catch (Exception e2) {
			}
		}
	}

}
