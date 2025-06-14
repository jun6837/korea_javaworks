package streams.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> sList = Arrays.asList(
				new Student("유빈", 90),
				new Student("상혁", 80),
				new Student("정후", 85)
				);
	//Stream 사용
		Stream<Student> stream  = sList.stream();
		stream.forEach(std ->{

			//System.out.println(std.getNmae() + ":" +std.getScore()));
			String name = std.getNmae();
			int score = std.getScore();
			System.out.println(name + ":" +score);

		});
		
		
		System.out.println("== 학생의 이름 출력 ==");
		stream = sList.stream();//stream 은 한번 사용되면 소모됨으로 다시 초기화
		stream.map(std -> std.getNmae())
			  .forEach(s->System.out.println(s));
		
		System.out.println("== 학생의 점수 출력 ==");
		stream = sList.stream();//stream 은 한번 사용되면 소모됨으로 다시 초기화
		stream.mapToInt(std -> std.getScore())
			  .forEach(s->System.out.println(s));
		
		System.out.println("== 점수가 90 이상인 학생의 이름");
		sList.stream().filter(std->std.getScore() >= 90)
				      .map(std->std.getNmae())
					  .forEach(s -> System.out.println(s));
	}
}
