package day15.api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
	
	public static void main(String[] args) {
		/*
		 * InPut이 붙어 있는 클래스는 1바이트 기반의 입력 스트림 클래스입니다.
		 * 1. 파일을 읽어들이는데 사용하는 클래스가 FileInputStream 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt";
		InputStream ios = null; // 바깥에 선언해야 전체에서 사용할 수 있음
		
		try {
			// InputStream ios = new FileInputStream(path); -> InputStream을 try 안에서 사용하면 try 안에서만 쓸 수 있기 때문에 finally의 ios.close()에서 에러가 발생함 
			ios = new FileInputStream(path);	
			
			// 1바이트씩 읽기
			while(true) {
				int data = ios.read();
				if(data == -1) { 
					break;
				}
				System.out.println(data);
				// System.out.println(char(data)); // 문자는 2바이트인데 inputstream은 1바이트로 데이터를 읽기 때문에 한글은 문자로 볼 수 없음 (영어는 아스키코드가 있어서 가능) 
				// System.out.println(ios.read()); // 더 이상 출력값이 없으면 -1 반환 -> 반복문 사용
			}
			
			// 바이트 배열로 한 번에 읽기
			byte[] arr = new byte[100]; // 100글자
			int length = ios.read(arr); // 읽은 내용을 arr에 저장시킴
			System.out.println("데이터를 읽은 길이: " + length);
			
			// 바이트 배열을 반복시켜서 글자 출력
			int i = 0;
			while(i < length) {
				System.out.println((char)arr[i]);
				i++;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ios.close();
			} 
			catch (Exception e2) {
			}
		}
	}
}