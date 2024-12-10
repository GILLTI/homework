package casting3;

//6번 : 자식객체의 타입 여러개인지 확인 - 자식클래스
public class Parents {
	public static void main(String[] args) {
		Parents p = new Parents();
		Child c = new Child();

		System.out.println(p);
		System.out.println(c);

		// 객체 instanceof 클래스명 => boolean타입으로 나온다
		//
		
		System.out.println(p instanceof Parents);
		System.out.println(p instanceof Child);
		System.out.println(c instanceof Child);
		System.out.println(c instanceof Parents);
		// 자식 클래스 타입의 객체는 부모 클래스 타입도 동시에 갖는다!!

	}
}
