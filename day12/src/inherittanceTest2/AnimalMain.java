package inherittanceTest2;

public class AnimalMain {
	public static void main(String[] args) {
		//동물 클래스의 객체 생성
		Animal ani = new Animal();
		//Animal 클래스에 있는 필드와 메소드만 사용가능
		ani.name = "먑먑아";
		System.out.println(ani.name);
		
		//새 클래스의 객체 생성
		// bied 클래스에 있는 멤버도 사용 가능 
		Bird bird = new Bird();		//생성자
		bird.name = "WO";
		bird.age = 2;
		bird.type = "참";
		System.out.println(bird.name);
		bird.eat();
		bird.fly();
		
	    // 강아지 클래스의 객체 생성
	      Dog dog = new Dog();
	      dog.name = "멍멍이";
	      dog.age = 3;
	      dog.type = "강아지";

	      System.out.println(dog);
	      dog.birthday();

	      // 고양이 클래스의 객체 생성
	      Cat cat = new Cat();
	      System.out.println(cat);
	      cat.name = "별이";
	      cat.age = 7;
	      cat.type = "고양이";
	      cat.meow();

	   }
	}
