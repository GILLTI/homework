package inherianceConstructor2;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("기아", "빨강", 14900);
		System.out.println(c1);
		System.out.println(c2);
		
		c1.brand = "현대";
		
		System.out.println(c1.brand); //null
		System.out.println(c2.brand); //기아
		
		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW", "남색", 15005, true);
		System.out.println(sc1);
		System.out.println(sc2);
		
		
		
			}
}
