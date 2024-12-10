package inherittanceTest2;

public class Animal {
	//필드
	String name; //인스턴스 필드 = 객체
	int age;
	String type;
	
	//메소드
	void eat() {
		System.out.println(this.name + "막고있다");
	}
	void play() {
		System.out.println(this.name + "놀고있다");
	}
	void sleep() {
		System.out.println(this.name + "자고있다");
	}
	void run() {
		System.out.println(this.name + "도망친다");
	}
	void birthday() {
	      this.age++;
	      System.out.println(this.name + "의 생일입니다! 이제 " + this.age + "살이 되었습니다");
	   }
	   
	}