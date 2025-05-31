package bin_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream is = new FileInputStream("C:/file/file1.bin");
			int data; //읽은 데이터 저장
//			while(true) {
//				data = is.read();
//				if(data == -1) break;
//				System.out.println(data);
//			}
			while((data = is.read()) != -1) {
//				System.out.println(data);
				System.out.println((char)data);
				
			}
			is.close();
			//다중 예외인 경우 부모 클래스만 사용해도 됨
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
