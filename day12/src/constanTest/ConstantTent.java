package constanTest;

public class ConstantTent {
	//클래스 내부에서 상수 선언						
	static final int Max_LENGTH = 100; //정적 변수 method, class로드시 초기화
	//정적변수의 상수 모든 객체가 공유, 클래스 전체에서 공통으로 사용하는 상수
	
	final double PI = 3.14159265359; //인스턴스 변수 heap, 객체생성시 초기화
	// 객체마다 독립적(값이 같아도 독립적),특정객체마다 고유한 상수를 정의할 때 사용
	//상수는 정적변수로 사용하는 경우가 많다 why? 값이 잘 변하지 않기 때문에
	//
	
	public static void main(String[] args) {
	//	System.out.println(Max_LENGTH); 같은 클래스라서 가능
		System.out.println(ConstantTent.Max_LENGTH);
		System.out.println (new ConstantTent().PI) ; //사용가능한데 1번 밖에 안됌
			
				System.out.println(ct.PI);
	}
	
}
