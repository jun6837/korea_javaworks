package datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("object.dat");
				DataOutputStream dos = new DataOutputStream(fos)){

			dos.writeInt(1); //학번
			dos.writeUTF("우영우"); //이름
			dos.writeDouble(95.1); //점수

			dos.writeInt(2); //학번
			dos.writeUTF("장그래"); //이름
			dos.writeDouble(88.7); //점수

			dos.flush();
			dos.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//데이터 읽기
		try(FileInputStream fis = new FileInputStream("object.dat");
				DataInputStream dis = new DataInputStream(fis)){
			for(int i=0; i<2; i++) {
				int no = dis.readInt();
				String name = dis.readUTF();
				double score = dis.readDouble();
				System.out.println(no + ". " + name + " : "+ score);
			}
			dis.close();
			fis.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
