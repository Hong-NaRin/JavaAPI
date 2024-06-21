package day15.api.io.directory;

import java.io.File;

public class CreateDirectory {
	
	public static void main(String[] args) {
		
		/*
		 * 자바에서는 외부경로로 폴더를 생성할 떼 File 클래스를 사용한다
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\뉴폴더";
		
		try {
			File file = new File(path);
			
			// 폴더가 있는지 확인하고 생성
			if(!file.exists()) { // !file.exists() - 존재하지 않으면 true, 존재하면 false
				file.mkdir(); // 뉴폴더를 만들어줌				
			}
			else {
				System.out.println("폴더가 존재함");
			}
			
			// 폴더 삭제
			if(file.exists()) { // file.exists() - 존재하면 true, 존재하지 않으면 false
				file.delete(); // 빈 폴더일 때 삭제
				// file.deleteOnExit(); // 하위 자식으로 있는 자료 or 파일을 한 번에 삭제 
				System.out.println("폴더 삭제 성공");
			}
			else {
				System.out.println("폴더 삭제 실패");
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
