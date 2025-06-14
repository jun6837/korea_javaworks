package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		//List 자료구조 사용
//		List<String> companyList = new ArrayList<>();
//		
//		//데이터 추가
//		companyList.add("LG");
//		companyList.add("SAMSUNG");
//		companyList.add("HYUNDAI");
		
		//Arrays 클래스
		List<String> companyList = Arrays.asList("LG", "SAMSUNG", "HYUNDAI");


		for(String company : companyList)
			System.out.println(company);
		System.out.println("-----------------------");
		//Steam 클래스 - 람다식
		Stream<String> stream = companyList.stream();
		//출력 - forEach()함수 사용
		stream.forEach(company -> System.out.println(company));
		System.out.println("-----------------------");
		//배열에서 Stream 클래스 사용하기
		String[] fruits = {"apple", "banana","grape"};

		for(String fruit: fruits)
			System.out.println(fruit);
		System.out.println("-----------------------");
		//Steam 인스턴스 생성
		Stream<String> stream2 = Arrays.stream(fruits);
		stream2.forEach(fruit -> System.out.println(fruit));
	} 
}
