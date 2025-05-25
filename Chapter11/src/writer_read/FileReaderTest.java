package writer_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("C:/file/text.txt");
			while(true) {
				int data = reader.read();
				// -1은 문자가 없다는 의미
				if(data == -1) break;
				System.out.print((char)data);
			}
			reader.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
