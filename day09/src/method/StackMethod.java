package method;

public class StackMethod { 
	 StackMethod sm = new StackMethod(); //1.메인메소드먼저 시작
	 { 									//stack에 main stack프레임이 생성	
     System.out.println(sm.add(10, 20));	//변수 result가 main stack 프레임에 저장
     										//2. add메소드 -> 스택에 add stack프레임이 생성
     										//매개뱐수 num1, num2, sum변수가 add stack프레임에 저장
  }											//3. add 메소드 종료 -> add stack 프레임 삭제
	 										// sum, num1, num2가 메모리에서 제거
	 										//4. main메소드 종료 -? main stack프레임 삭제
	 										
  int add(int num1, int num2) {
     int sum = num1 + num2;   			///이 자제가 값이다.
     return sum;
  }
}
