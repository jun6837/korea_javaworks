package jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJson {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("member.json"))){			String json = br.readLine();
			
			//파싱- 구문 해석
			JSONObject root = new JSONObject(json);
			
			//속성 정보
			System.out.println(root.getString("id"));
			System.out.println(root.getString("name"));
			System.out.println(root.getInt("age"));
			System.out.println(root.getBoolean("student"));
			
			
			//tel 정보
			JSONObject tel = root.getJSONObject("tel");
			System.out.println("home: " + tel.getString("home"));
			System.out.println("mobile: " + tel.getString("mobile"));
			
			//배열의 속성 정보
			JSONArray skill = root.getJSONArray("skill");
			System.out.println("skill: ");
//			for(int i=0;i<skill.length(); i++) {
//				System.out.println(skill.get(i)+ ", ");
//			}
		    for(Object sk : skill)
		    	System.out.println(sk + ", ");
		    
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
