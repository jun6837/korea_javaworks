package polymorphism;
	/*
	 * 다형성 - 객체 타입을 여러가지 형태로 결정하는 것
	 */
	class Animal{
		public void move() {
			System.out.println("동물이 움직입니다.");
		}
	}
	
	class Human extends Animal{
		public void move() {
			System.out.println("사람이 두 발로 움직입니다.");
		}
	}
	
	class Horse extends Animal{
		public void move() {
			System.out.println("말이 네 발로 뜁니다.");
		}
	}
	class Eagle extends Animal{
		public void move() {
			System.out.println("독수리가 높이 날아갑니다.");
		}
	}
	
	public class AnimalTest {
		//다형성 구현을 위한 메서드
		public void moveAnimal(Animal animal) {
			animal.move();
		}
		public static void main(String[] args) {
			AnimalTest aTest = new AnimalTest();
			//부모 타입 = 자식 타입 (자동 형변환)
			/*Animal human = new Human();
			Animal horse = new Horse();
			human.move();
			horse.move();
			*/
			aTest.moveAnimal(new Human());
			aTest.moveAnimal(new Horse());
			aTest.moveAnimal(new Eagle());
			
			
		}
	
}
