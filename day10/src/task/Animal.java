package task;

public class Animal {
	//필드를 생성
	//기본생성자 생성
	//모든 필드의 매개변수를 받는 생성자 생성
	//메소드 생성
	
	String name;
	int age;
	String mol;
	
	public Animal(){
		
	}

	public Animal(String name, int age, String mol) {
		super();
		this.name = name;
		this.age = age;
		this.mol = mol;
	}


	void eat() {
		System.out.println("밥먹기" + name + age + mol);
	}
	void play() {
		System.out.println("놀기" + name + age + mol);
	}
	void sleep() {
		System.out.println("잠자기" + name + age + mol);
	}
	void birt() {
		System.out.println("생일축하" + name + age + mol);
	}
	
	


//1. 동물 클래스를 작성하세요
//필드(속성) : '이름', '나이', '종류'라는 필드
// - 이름 : 동물의 이름을 저장하는 곳
// - 나이 : 동물의 나이를 저장하는 곳
// - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//메서드(행동)
// - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
// - 놀기() : 동물이 노는 행동을 하는 메서드
// - 자다() : 동물이 자는 행동을 하는 메서드
// - 생일축하() : 동물의 생일을 축하하는 메서드
	}
	