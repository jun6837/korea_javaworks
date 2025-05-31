package bin_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		// 이미지를 읽어서 쓰기(복사)
		String originFile = "C:\\javaworks\\Chapter11\\white-cat.jpg";
		String copyFlie = "C:\\javaworks\\Chapter11\\white-cat2.jpg";
		long start, end;
		
		try(InputStream is = new FileInputStream(originFile); 
		    OutputStream os = new FileOutputStream(copyFlie)){
			start = System.currentTimeMillis();
			while(true) {
				int num = is.read();
				if(num == -1) break;
				os.write(num);
			}
			os.flush();
			end = System.currentTimeMillis();
			System.out.println("소요 시간 : " + (end - start) + " ms");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
