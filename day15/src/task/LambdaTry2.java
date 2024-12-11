package task;
//1. 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드(람다식 이용)
//FunctionalInter3 이용하기

//- 새로운 함수형 인터페이스(FunctionalInter4)를 만들고
//- 2개의 문자열을 매개변수로 전달받는 추상 메소드(combineString)를 선언한다.
//- 람다식을 이용하여 2개의 문자열을 연결하여 출력한다.
//
//1. 이름을 없애고 -> 추가
// 2. 리턴타입 추론가능하므로 생략가능하다(선택)
//3. 매개변수 타입은 추론 가능하므로 생략가능하다(선택)
//4. 명령문이 2개이상이므로 {}와 ; 생략불가

public class LambdaTry2 {
	public static void main(String[] args) {
		//익명클래스로 객체 생성 
//		FunctionalInter3 t1 = new FunctionalInter3() {
//			
//			@Override
//			public int printing(int num1, int num2) {
//				System.out.println(num1 * num2);
//				return num1 * num2 ;
//			}
//		};
//		
//		//람다식으로 객체 생성
//		FunctionalInter3 t2 = (num1, num2) 
//		-> {System.out.println(num1 * num2);
//							return num1 * num2 ;};
//		System.out.println(t1.printing(2, 3));
//		System.out.println(t2.printing(5, 4));
	
	
		//익명클래스로 객체 생성
		FunctionalInter4 s1 = new FunctionalInter4() {
			
			@Override
			public String combineString(String a, String b) {
			System.out.println(a + b);
				return a + b;
			}
		};
	
		//람다식으로 객체 생성
		FunctionalInter4 s2 = (a , b)
		-> {System.out.println(a + b);
		return a + b;};
		
		System.out.println(s1.combineString("안", "녕"));
		
	
	}
	
	}

