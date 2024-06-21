package day15.api.io.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BfOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는, 성능향상 클래스 입니다.
		 * Buffered + 스트림클래스 명으로 사용합니다.
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello3.txt";
		
		BufferedOutputStream bos = null; // 1byte 기반으로 데이터를 씀
		BufferedInputStream bis = null; // 1byte 기반으로 데이터를 읽음
		
		try {
			
//			OutputStream os = new FileOutputStream(path);
//			BufferedOutputStream bos = new BufferedOutputStream(os);	
			bos = new BufferedOutputStream(new FileOutputStream(path));
			bis = new BufferedInputStream(new FileInputStream(path)); // 버퍼로 스트링 타입 감싸줌
			
			//데이터를 씀
			String str = "hello world";
			bos.write(str.getBytes()); // bos.write(str.getBytes(), 0, str.length()); 
			
			// flush를 사용해서 버퍼를 비울 때, 글이 써져 내려감
			bos.flush();
			
			///////////////////////////////////////////////////////
			/// 데이터를 읽음
			
			while(true) {
				
				int word = bis.read();
				if(word == -1) break;
				System.out.println((char)word);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bos.close();
				bis.close();
			} catch (Exception e2) {
			}
		}
	}
}