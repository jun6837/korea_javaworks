package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "프로그래밍";
		
		//람다식
		StringConcat concat;
		concat = (s, v) -> System.out.println(s+ ", "+ v);
		concat.makeString(str1, str2);

	}

}
