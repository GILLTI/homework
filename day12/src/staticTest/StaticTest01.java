package staticTest;
//2번 : 정적메소드와 인스턴스 메소드
public class StaticTest01 {
		public static void main(String[] args) {
//			StaticTest01.staticMethod(); //클래스 이름으로 실행할 수 있는건 정적메소드
//			//정적메소드를 호출할때는 클래스명.메소드명으로 호출
//			
			StaticTest01 st = new StaticTest01();
//			st.staticMethod();  //정적메소드를 호출하지만 권장하지 않음
//			
//			staticMethod();
//			//같은 클래스에 있는 static 메소드는 메소드명으로만도 호출가능
//			
//		     // 인스턴스 메소드 호출
		      st.instanceMethod1();		//객체 생성후 메인메소드 실행 
//		      st.instanceMethod2();

			
			
		}
		
		//인스턴스 메소드1
		void instanceMethod1() {
			System.out.println("인스턴스메소드1 실행");
		}
		
		//인스턴스 메소드2
		void instanceMethod2() {
			System.out.println("인스턴스메소드2 실행");
		}
		
		//정적메소드
		   static void staticMethod() {
			      System.out.println("정적 메소드 실행");
//			      instanceMethod1(); //인스턴스 메소드 호출 불가

		//객체가 있어야한다 항상 메모리에서 대기상태 
		
		
		
		
		
		
		
		
		
		
		
		
		 }	
		
}
