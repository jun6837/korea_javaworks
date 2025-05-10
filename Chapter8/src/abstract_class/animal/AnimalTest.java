package abstract_class.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// CAT 의 객체 생성
		Animal cat = new Cat(); // 부모타입으로 객체를 생성- 다형성
		cat.breath();
        cat.cry();
        Animal dog = new Dog();
        dog.breath();
        dog.cry();
	}

}
