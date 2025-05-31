package bin_file;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest2 {

	public static void main(String[] args) {
		// 바이트 기반 파일 쓰기
		// try ~ with ~ resource (자원을 효율적으로 사용) - close() 사용안함
		try(OutputStream os = new FileOutputStream("file2.bin")){ //상대 경로- 내 파일을 기준으로 위치를 정해
			byte[] array = {48, 49, 50, 51,52};
			//특정데이터 보내기
			os.write(array, 1, 3); // 1~3번 인덱스 쓰기
			
			os.flush();
			System.out.println("쓰기완료~");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없스니다.");
		}
		
	}

}
