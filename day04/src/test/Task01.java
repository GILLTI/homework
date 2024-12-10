package test;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		
		//1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
		//1) 입력 클래스 import
		//2) 변수 선언 금액 입력 받기
		//3) 5만원 나누고 나머지 저장 1만원 5천원 1천원 순서 
		//4) 입력 메소드 nextInt
		//5) 츨력
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오 : ");
		int money = sc.nextInt();
		
		int moy1 = money / 50000;
		money %= 50000;
		int moy2 = money / 10000;
		money %= 10000;
		int moy3 = money / 5000;
		money %= 5000;
		int moy4 = money / 1000;
		
		System.out.println("5만원 :" + moy1);
		System.out.println("1만원 :" + moy2);
		System.out.println("5천원 :" + moy3);
		System.out.println("1천원 :" + moy4);
		sc.nextLine();
		
//		//2. 키와 몸무게를 입력받아 BMI를 계산하기
	
		// 공식 : 몸무게 / (키 * 키)
		// 1) 변수선언 double로 3개 만들기
		// 2) 출력메시지
		// 3) 입력 nextDouble
		// 4) 출력 BMI 계산
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게를 입력하시오 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println("BMI : " + bmi);
		sc.nextLine();
		
		//3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
		//공식 : 0.5 * 밑변 * 높이
	
		//1) 변수언언 double로 3개
		//2) 출력메시지
		//3) 입력메소드 nextDouble
		//4) 계산후 출력
		System.out.print("밑변을 입력 :");
		double a = sc.nextDouble();
		System.out.print("높이를 입력 : ");
		double b = sc.nextDouble();
		double result = 0.5 * a * b ;
		System.out.println("삼각형 높이 : " + result);
		sc.nextLine();
	
		//4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)
	
		//1) 변수 선언 int 2개 boolean 1개
		//2) 출력메시지
		//3) 입력메소드 nextInt
		//4) 출력
		System.out.println(" 정수 2개를 입력하세오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean result1 = num1 > 0 && num2 > 0 ;
		System.out.println("두수 모두 0보다 크다 : " + result1);
		sc.nextLine();
	
		//5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원
	
		//1) 변수선언 int 3개
		//2) 출력메시지
		//3) 입력메소드 nextInt
		//4) 총액 계산후 출력
		System.out.print("물건의 개수 : ");
		int object = sc.nextInt(); 
		System.out.print("물건의 가격 : ");
		int price = sc.nextInt(); 
		int total = object * price ; 
		System.out.printf("총액 : %d원\n" , total);
		sc.nextLine();
	
		//6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의IO 합)
		
		//1) 변수선언 int 2개
		//2) 출력메시지
		//3) 입력메소드 nextInt()
		//4) 각 자리 숫자 합 계산 (첫자리 / 10 ) (두번째 % 10 )
		//5) 츨력 
		
		System.out.print("두 자리수를 입력하시오 : ");
		int twonum = sc.nextInt();
		int sum = (twonum / 10) + (twonum % 10) ;
		System.out.printf("각 자리 숫자의 합 : %d\n", sum);
		sc.nextLine();
		
		//7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		//true or false
		
		//1)변수선언 int boolean
		//2)출력메시지
		//3)입력메소드 nextInt
		//4)&&조건 확인
		//5)출력
		System.out.print("정수를 입력 :");
		int tnum = sc.nextInt();
		boolean check = (tnum > 0) && (tnum % 2 == 0); 
		System.out.printf("양수이면서 짝수인가 : %b\n" , check);
		sc.nextLine();
		
		//8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		//ture or false
		
		//1)변수선언 int 2개 boolean			//1) 변수선언 3개 int 2개, boolean 1개
		//2)츨력메시지							//2) 입력클래스 import
		//3)입력메소드nextInt					//3) 변수1 = 
		//4)크거나 같은지 확인
		//5)출력
		System.out.println("숫자 두 개를 입력 하시오 : ");
		int frist = sc.nextInt();
		int two = sc.nextInt();
		boolean right = frist >= two ;
		System.out.printf("첫번째 수가 크거나 같은가? %b\n", right);
		sc.nextLine();
		
		//9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
		//true or false
		
		//1)변수선언int2개 boolean
		//2)출력메시지
		//3)입력메소드 nextInt
		//4) && || 조건 확인하기
		//5) 출력
		System.out.println("숫자 두 개를 입력 하시오 : ");
		int frist1 = sc.nextInt();
		int two1 = sc.nextInt();
		boolean check1 = (frist1 > 0 && two1 <= 0) || (frist1 <= 0 && two1 > 0);
		System.out.printf("양수인가? %b\n" , check1);
		sc.nextLine();
		
		
		//10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		//true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
		
		//1)import
		//2)변수선언 int boolean
		//3)출력메시지
		//4)입력메소드 nextInt
		//5)조건 확인후 출력
		
		System.out.print("연도를 입력하시오 :");
		int year = sc.nextInt();
		boolean result3 = false;
		year = sc.nextInt();
		result3 = (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0;
		System.out.println(result3);
//      System.out.println(year + "는 윤년입니다");
//      System.out.println(year + "는 윤년이 아닙니다");
      
      System.out.println(result3 ? year + "는 윤년입니다" : year + "는 윤년이 아닙니다");
      	sc.close();
		
		//계산 식을 모르겠어요..
		
	}
}













