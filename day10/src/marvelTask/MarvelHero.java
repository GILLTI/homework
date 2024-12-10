package marvelTask;

public class MarvelHero {
	// 마블에 나오는 히어로를 객체로 만들어 출력하기
//  필드
	// 이름, 슈퍼파워(String superpower), 나이

//  생성자
	// 모든 필드를 매개변수로 받는 생성자

//  정보출력 메소드(printInfo())
	// 모든 필드 내용 출력

//1.필드를 생성해준다
	String name;
	String superpower;
	int age;

//2.이름과 슈퍼파워 나이를 초기화하는 생성자를 만든다
	public MarvelHero(String name, String superpower, int age) {
		this.name = name;
		this.superpower = superpower;
		this.age = age;
		System.out.println(this);

	}

//3. 모든 정보를 출력하는 메소드	
	void printInfo() {

		System.out.println("히어로의 이름은: " + name);
		System.out.println("히어로의 능력은: " + superpower);
		System.out.println("히어로의 나이는: " + age);
	}
	void prientff() {
		System.out.println(name + superpower + age);
		
	}
	

	
}
