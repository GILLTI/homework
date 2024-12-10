package staticTest;
//3번 : 정적 변수와 정적메소드
public class MyClassA {

	//필드( 인스턴스 변수, 스태틱 변수, 상수)
	int instanceVar; // new 객체를 만들어서 heap 메모리에서 사용
	// 인스턴스변수
	 
	
	// 스태틱변수
	   static int staticVar;

	

		
	//메소드( 인스턴스 메소드, 스태틱 메소드)
	   // 인스턴스 메소드1
	   void instanceMethod1() {
	      System.out.println("인스턴스메소드1 실행");
	  
	      instanceVar = 10;
	      System.out.println("인스턴스 메소드1에서 인스턴스 변수 값 :" + instanceVar);
	      staticVar = 10;
	     System.out.println("인스턴스 메소드1에서 인스턴스 변수 값 :" + staticVar);
	      
	     instanceMethod2();
	      staticMethod1();
	   }

	   // 인스턴스 메소드2
	   
	   void instanceMethod2() {
	      System.out.println("인스턴스메소드2 실행");
	     
	       }

	   // 정적메소드
	   static void staticMethod1() {
		    System.out.println("스태틱메소드1이 호출되었습니다");
//	      instanceMethod2(); //스태틱메소드에서 인스턴스 메소드 호출 불가
//	      instanceVar = 100; //스태틱메소드에서 인스턴스 변수 접근 불가
	      staticVar = 200;
	      System.out.println("스태틱메소드1에서 스태틱변수 값 : " + staticVar);
	      staticMethod2();
	   }

	    
	   static void staticMethod2() {
		      System.out.println("정적 메소드 실행2");
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
}