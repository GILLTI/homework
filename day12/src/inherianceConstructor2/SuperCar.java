package inherianceConstructor2;

public class SuperCar extends Car{
	//필드
	boolean booster;
	
	//메소드
	void boosterOn() {
		System.out.println("부스터어어");
	}
	void boosterOff() {
		System.out.println("부스터으으으");
	}
	
	
	   // 생성자
	   public SuperCar() {
	      super();
	   }

	   public SuperCar(String brand, String color, int price, boolean booster) {
	      super(brand, color, price);
	      this.booster = booster;
	   }
	}
