package day15.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * input, outputstream 클래스는 1바이트 기반으로 파일을 읽고 쓰는데 적합하다
		 */
		
		String inputpath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\quiz.png";
		String outputpath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\quiz_copy.png";
		
		InputStream ios = null;
		OutputStream fos = null;
		
		try {
			ios = new FileInputStream(inputpath);
			fos = new FileOutputStream(outputpath);
			
			byte[] arr = new byte[1000]; // 크기가 44kb, 1000바이트씩 44번
			// ios.read(); // 사진은 용량이 크기 때문에 시간이 오래 걸림
			
			int result;
			while((result = ios.read()) != -1) { // 읽어서 바이트로 올라감 
				// read(바이트) - 읽은 길이를 반환하고 더 이상 읽을 내용이 없다면 -1 반환
				// 파일 output
				fos.write(arr, 0, result); // 배열의 0~데이터 길이까지 파일을 씀
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
