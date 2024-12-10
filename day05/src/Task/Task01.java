package Task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		//로직구성필수!!
		//다양한 로직을 생각해 보는 연습하기
		
//		1. 한개의 정수를 입력받아 짝수인지 홀수인지 출력하기
//		입력 : 8
//		출력 : 짝수입니다
//
		//1) 객체생성
		//2) 정수입력 nextInet
		//3) 짝수 홀수 판단 % 2 == 0
		//4) 출력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("정수를 입력 : ");
//				
//		int num = sc.nextInt();
//		
//		System.out.println(num % 2 == 0 ? "짝수입니다" : "홀수입니다");
//		sc.nextLine();				
				
//		2. 한개의 정수를 입력받아 양수, 음수, 0인지 출력하기
//		입력 : -5
//		출력 : 음수입니다
//
//		입력 : 100
//		출력 : 양수입니다
//
//		입력 : 0
//		출력 : 0입니다

		//1) 객체생성
		//2) 정수입력 nextInt
		//3) 입력값 if else로 판별
		//4) 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하시오 :");
//		int num1 = sc.nextInt();
//		if( num1 == 0 ) {
//			System.out.println("0");
//		}else {
//			System.out.println(num1 > 0 ? "양수입니다" : "음수입니다");
//		}
//		
//		sc.nextLine();
//		
		//3. 나이를 입력받아 다음 기준으로 출력하기
//			0~12: 어린이
//			13~19: 청소년
//			20 이상: 성인
//
//		나이입력 : 16
//		청소년입니다
		
		//1) 객체생성
		//2) 정수입력 nextInt
		//3) 입력값 if else if로 판별
		//4) 출력
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하시오 :");
//		int age = sc.nextInt();
//		if( age == -1) {
//			System.out.println("잘못 입력");
//		}else if(age >= 0 && age <= 12) {
//			System.out.println("어린이");
//		}else if(age >= 13 && age <= 19) {
//			System.out.println("청소년");
//		}else if(age >= 20) {
//			System.out.println("성인");
//		}
//		sc.nextLine();
//	★	4. 세 개의 정수를 입력받아 가장 작은 숫자부터 큰 숫자 순으로 정렬하여 출력하기(단, 삼항연산자만 이용할 것)
//			입력 : 5 1 9
//			출력 : 1 5 9
//
//		//1) 객체생성
//		//2) 정수입력 nextint 3개
//		//3) 큰수부터 작은수 3자리를 각각 계산하기
//		//4) 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("세 개의 정수를 입력하오: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		//어떻게 계산식을 짜야할지 감이 오질 않아요...
//		int frist = ();
//		int second = ();
//		int third = ();
//				
//		System.out.println("정렬결과" + frist + "" + second + "" + third);
		
		
//		5. 사용자로부터 문자열을 입력받고 "X"만 입력했을 경우에만 종료 메시지를 출력하고 그 외에는 입력한 문자열을 출력하기
//
		//1) 객체생성
		//2) String 문자열 사용 
		//3) if else문 사용 
		//4) 문자열이기 때문에 == 말고 equals 사용
		//5) 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열을 입력하시오 :");
//		String in = sc.nextLine();
//		if(in.equals("x")) {
//			System.out.println("종료");
//		}else {
//			System.out.println("입력한 문자열 : " + in);
//		}
		
//
//		6. 사용자가 입력한 숫자에 해당하는 구구단을 출력하기
//		단을 입력하세요 : 3단
//		출력
//		3 x 1 = 3
//		3 x 2 = 6
//		...
//		3 x 9 = 27
//
		//1) 객체생성
		//2) 입력값 nextInt
		//3) for문 사용 
		//4) 1부터9까지 증가하는 변수 i 사용
		//5) 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단을 입력하시오 : ");
//		int mul = sc.nextInt();
//		
//		for (int i = 1; i <=9; i++) {
//			System.out.println(mul + "x" + i + "=" + (mul * i));
//			}
//		sc.nextLine();
//
//		7. ATM 메뉴에서 입금, 출금, 잔액 조회를 구현하세요.
//
//		[조건]
//		초기 잔액은 10000원으로 설정
//		메뉴에서 선택에 따라 작업 수행
//		종료 시 프로그램 종료
//
//		String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//		            + "1. 잔액 조회"
//		            + "2. 입금"
//		            + "3. 출금"
//		            + "4. 종료"
//		            + "선택 : ");

		//1) 객체생성
		//2) 종료가능하게 while문 사용
		//3) nextInt 입력값
		//4) switch 메뉴 구현
		//5) case 4개 만들기
		//6) 출력
//		Scanner sc = new Scanner(System.in);
//		int one = 10000;
//		while (true) {
//			String msg =  "\nATM 메뉴의 번호를 선택하세요 : "
//		            + "1. 잔액 조회"
//		            + "2. 입금"
//		            + "3. 출금"
//		            + "4. 종료"
//		            + "선택 : ";
//			System.out.println(msg);
//		
//		int choice = sc.nextInt();
//		
//		switch (choice) {
//		case 1:
//				System.out.println("현재잔액 :" + one );
//				break;
//		case 2:
//			System.out.println("입금");
//			break;
//		case 3:
//			System.out.println("출금");
//			break;
//		case 4:
//			System.out.println("종료");
//			return;	
//						}
//			sc.nextLine();
//					}
//
//	}
//}
