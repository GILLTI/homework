package classBasic2;
//5번 클래스의 특징3(객체 생성의 틀)
public class Car {
	//필드
	String model; //모델명
	String color; //생상
	int speed; //속도
	
	
	//메소드
	//속도를 증사시키는 메소드
	void accelerate(int value) {	//매개변수 있고 리턴타입 있다
		speed += value;
		
	}
	
	//주행을 멈추는 메소드
	void stop() {
		speed = 0;
	}
	
	
}
