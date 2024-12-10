package oper;
//9번 : 복합대입 연산자 , 증감연산자


public class OperTest02 {
		public static void main(String[] args) {
		
			
			int num = 1; //초기값이 무조건 필요하다
			System.out.println(num);
			System.out.println(num + 10);
			
//			num = num + 10;
		System.out.println(num);	
		num += 10 ; 	//	num = num + 10;
		System.out.println(num);
		
		num *= 2;
		System.out.println(num);
		
		num /= 2;
		System.out.println(num);
		
		System.out.println("==증감연산자==");
		
		int num2 = 1;
		System.out.println("기존 num2의 값 : " + num2 ); //1
		System.out.println("전위형을 사용한 num2의 값 : " + ++num2 ); //2
		System.out.println("전위형을 사용한 num2의 값 : " + ++num2 ); //3

		int num3 = 1;
		System.out.println("기존 num3의 값 : " + num3 ); //1
		System.out.println("후위형을 사용한 num3의 값 : " + num3++ ); //2
		System.out.println("후위형을 사용한 num3의 값 : " + num3++ ); //2
		//특별한 게 없으면 후위형으로 사용
		
		
		   int num1 = 7, num4 = 7;
		   int result1 = 0, result2 = 0;

		   result1 = --num1 + 4;
		   result2 = num4-- + 4;

		
		}
}
