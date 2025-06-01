package buffered_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) {
		// 파일에 쓰기
		try (Writer writer = new FileWriter("word.txt")) {
			String message = "ant bear cow chicken eagle elephant " 
					+ "fox horse monkey penguin tiger ";
			writer.write(message);
			writer.flush();

			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
