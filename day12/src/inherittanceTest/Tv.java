package inherittanceTest;
//7번 : 상속 기초
public class Tv {
	//필드
	int ch;
	int vol;
	boolean power;
	
	//메소드
	void powerOnOff() {
		if(power) {
			System.out.println("tv가 켜졌습니다.");
		}else {
			System.out.println("tv가 켜졌습니다.");
		}
	}
	
	void chUpDown() {
		System.out.println("채널을 올립니다");
		
	}
	
	void chDown() {
		System.out.println("채널을 내립니다.");
	}
	
}
