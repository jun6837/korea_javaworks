package writer_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			Writer writer = new FileWriter("C:/file/text.txt");
			//한 개의 문자쓰기
			writer.write('A');
			writer.write('b');
			
			//아스키 코드값
			writer.write(49);
			
			//배열을 사용하여 문자 쓰기
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			//줄바꿈 
			writer.write('\n');
			
			//문자열 쓰기
			writer.write("Korea");
			writer.write("좋아요");
			
			
			writer.flush(); // 버퍼의 데이터 강제 쓰기(출력)
			writer.close(); // 파일 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
