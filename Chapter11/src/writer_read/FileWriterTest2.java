package writer_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {

	public static void main(String[] args) {
		// 기존 파일에 추가로 내용 쓰기 -true 모드 사용
		try {
			Writer writer = new FileWriter("C:/file/text.txt", true);
			
			writer.write("오늘도 좋은 하루 되세요~");
			
			
			
			writer.flush(); // 버퍼의 데이터 강제 쓰기(출력)
			writer.close(); // 파일 닫기
			System.out.println("추가 쓰기 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
