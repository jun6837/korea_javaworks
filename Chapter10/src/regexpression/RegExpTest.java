package regexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		//정규 표현식 - complie("a*b") : a가 0번이상 반복(a가 없어도 됨)
		//정규 표현식 - complie("a+b") : a가 1번이상 반복(a가 없으면 안됨)  
		Pattern pat = Pattern.compile("a+b");
		Matcher mat = pat.matcher("aab");
		
		boolean result = mat.matches();
		
		System.out.println(result);
		
		//숫자만 허용하는 패턴 검사
		String pattern = "^[0-9]*$";
		String str = "abc1234";
		
		boolean result2 = Pattern.matches(pattern, str);
		System.out.println(result2);
		
		//한글 이름과 전화번호 패턴 검사
		String name = "제갈수현";
		String tel = "010-1234-5678";
		
		boolean name_check = Pattern.matches("^[가-힣]{2,5}$", name);
		System.out.println("이름 검사: " + name_check);
		boolean tel_check = Pattern.matches("010[-](\\d{3}|\\d{4})[-]\\d{4}$", tel);
		System.out.println("전화번호 검사: " + tel_check);
		
		//한글 이름 패턴 유효성 검사
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String inputName = sc.nextLine();
		
		if(!Pattern.matches("^[가-힣]{2,5}$",inputName)) {
			System.out.println("올바른 한글 이름이 아닙니다.");			
		}else
		System.out.println("이름: " + inputName);
		sc.close();
	}

}
