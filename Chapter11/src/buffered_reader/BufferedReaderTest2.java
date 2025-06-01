package buffered_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedReaderTest2 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("word.txt"))){
			String str;
			String[] list = null; //분리된 단어을 저장할 배열
			
			while((str = br.readLine()) !=null) {
				list = str.split(" ");
				
			}
			System.out.println("첫단어: " + list[0]);
			//배열 객체 출력
			System.out.println(Arrays.toString(list));
			//random 출력
			int rndIdx = (int)(Math.random() * list.length);
			System.out.println("단어: " +list[rndIdx]);
			
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
