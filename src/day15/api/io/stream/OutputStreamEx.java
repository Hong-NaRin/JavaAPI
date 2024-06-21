package day15.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * OutPut이 붙어 있는 클래스는 1바이트 기반의 출력 스트림 클래스입니다.
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다
		 * 2. io패키지에 모든 클래스는 throws가 있어서 try~catch 블록과 함께 사용한다
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt"; // 파일명을 포함한 경로 
		// (\)를 2개 쓰는 이유는 1개를 쓰게 되면 탈풀이 되기 때문에 특수문자를 입력하기 위해서 사용
	
		OutputStream fos = null; 
		
		try {
			fos = new FileOutputStream(path); // == FileOutputStream fos = new FileOutputStream()
			
			// 출력할 문자
			String str = "안녕하세요?\n즐거운 화요일입니다.";
			fos.write(str.getBytes()); // 문자열을 byte로 변환하는 방법 - getByte()
			// fos.close(); // 스트림 자원해제 - fos.close()를 해주지 않으면 계속 실행이 되기 때문에 finally에서 해주는 것이 정석
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) { // fos.write(str.getBytes()); 쓰기 위한 예외처리
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();	
			}
			catch (Exception e2) {
			}
		}
	}
}
