package anonymousTest;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal cat = new  Animal() {

			@Override
			public void speak() {
				System.out.println("야옹~~");
				//익명클래스- 상속을 줄일 수 있다, 내부클래스
				// 업캐스팅- 상속관계에서만 가능하다
				// 오버라이딩- 상속관계에서만 가능하다 
				//	상속- 	
			}
			
		};
		
		Animal dog = new Animal() {
			
			@Override
			public void speak() {
			System.out.println("멍멍!!"); //다형성 적용된 코드
			}
		};
		   System.out.println(cat);
		      System.out.println(dog);
	}
}
