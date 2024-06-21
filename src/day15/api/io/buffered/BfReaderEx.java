package day15.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BfReaderEx {
	
	public static void main(String[] args) {
		
		// 빠른입력
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 스캐너 (System.in)이랑 같음
//		System.out.println("입력> ");
//		String str = br.readLine(); // 한 줄 받기
//		System.out.println(str);

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(path));
			
			String str;
			while((str = br.readLine()) != null) { // 더 이상 읽을 게 없으면 null
				System.out.println(str);
			}

//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // 더 이상 읽을 게 없으면 null

		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
