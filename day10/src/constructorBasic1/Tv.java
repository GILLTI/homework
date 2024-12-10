package constructorBasic1;

public class Tv {
	//필드
	boolean power;	//기본값 false
	int ch;
	int vol;
	String color;
	String brand;
	
	
	
	
	
	//메소드
	//전원 키고 끌수있는 메소드
	
	void powerOnOff() {
		//리턴값 없으니 void
		//전원키고 끄고 
		//전원 상태 출력시키기( 삼항연산자사용)
		power = !power;
		System.out.println("전원 상태 : " + (power ? "켜짐" : "꺼짐")); 
	}
	//생성자 오버로딩 => 개수와 순서를 맞춰서 만들어야 한다
	// 생성자는 heap 메모리에 저장 , 객체가 만들어짐과 동시에 생성?
	//기본 생성자 => 개발자가 만들지 않으면 컴파일러가 자동으로 생성 > 무조건 있다
	public Tv() {
		
	}

	//매개변수 2개있는 생성자
	public Tv(boolean power, int ch) {
		super();
		this.power = power;
		this.ch = ch;
	}

	//매개변수 5개 있는 생성자
	public Tv(boolean power, int ch, int vol, String color, String brand) {
		
		this.power = power;
		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}



	// 볼륨 올리고 내릴 수 있는 메소드
	   // 메소드명 : increaseVolume() , decreaseVolume()
	   // 리턴값 x, 매개변수 x

	   void increaseVolume() {
	      // 1) 조건문(if~else문) power가 true라면 볼륨 +1 현재볼륨 출력
	      // 그게 아니라면 전원이 꺼져있습니다 출력
	      if (power) {
	         System.out.println("현재 볼륨 : " + vol);
	         if (vol <= 99) {
	            vol++;
	            System.out.println("올린 후 현재 볼륨 : " + vol);
	         } else {
	            System.out.println("볼륨이 최대치입니다");
	         }
	      } else {
	         System.out.println("전원을 먼저 켜주세요");
	      }
	   }

	   void decreaseVolume() {
	      if (power) {
	         System.out.println("현재 볼륨 : " + vol);
	         if (vol > 0) {
	            vol--;
	            System.out.println("볼륨 내린 후 현재 볼륨 : " + vol);
	         } else {
	            System.out.println("볼륨이 최소치입니다");
	         }
	      } else {
	         System.out.println("전원을 먼저 켜주세요");
	      }
	   }

	   // 채널 올리고 내릴 수 있는 메소드
	   // 메소드명 : nextChannel(), previousChannel()
	   // 리턴값 x, 매개변수 x

	   void nextChannel() {
	      // 전원이 켜져있을 때 채널 +1 현재채널 출력
	      // 전원이 꺼져있을 때 전원켜줘 출력
	      if (power) {
	         System.out.println("현재 채널 : " + ch);
	         if (ch <= 999) {
	            ch++;
	            System.out.println("올린 후 현재 채널 : " + ch);
	         } else {
	            System.out.println("채널이 최대치입니다");
	         }
	      } else {
	         System.out.println("전원이 꺼져있습니다");
	      }
	   }

	   void previousChannel() {
	      if (power) {
	         System.out.println("현재 채널 : " + ch);
	         if (ch > 1) {
	            ch--;
	            System.out.println("채널 내린 후 현재 채널 : " + ch);
	         } else {
	            System.out.println("채널이 최소치입니다");
	         }
	      } else {
	         System.out.println("전원이 꺼져있습니다");
	      }
	   }
	}

