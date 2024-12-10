package scanner;

import java.util.Scanner;

//7번 : 압력메소드 실습


public class ScannerTesk02 {

	public static void main(String[] args) {
		
		//1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
		//-세개의 숫자를 각각 입력받기
		//-세 숫자의 합을 계산하여 출력
		//-세 숫자의 합은 00입니다 형식으로 출력하기
		//1 변수 3개선언 - 초기화해주기
		//2 입력클래스 inport
		//3 출력메시지 
		//4 변수 = nextint
		//5 출력메시지
		//6 변수 = nextint
		//7 출력메시지
		//8 변수 = nextLine
		//9 출력 세 숫자의 합은 00 입니다
//		
//		int num1 = 0;
//		int num2 = 0;
//		int num3 = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 :");
//		num1 = sc.nextInt();
//		sc.nextLine();
//		System.out.print("숫자 :");
//		num2 = sc.nextInt();
//		sc.nextLine();
//		System.out.print("숫자 :");
//		num3 = sc.nextInt();
//		sc.nextLine();
//		System.out.println("세 숫자의 합은" + (num1+num2+num3) + "입니다");
		
		//2. 사용자로부터 일어난 시간(정수) 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
		// -아침, 점심, 저녁에 할 일과 잠들 시간을 각각 입력받기
		// -순서대로 입력받고 출력할 것
		// -출력 형식
		// 오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
		// 아침 : 00하기
		// 점심 : 00하기
		// 저녁 : 00하기
		//1 변수 5개 선언 int,string
		//2 입력클래스 import
		//3 출력메시지- 일어난 시간
		//4 변수 -nextInt
		//5 출력메시지 - 잠들시간
		//6 변수 -nextInt
		
		int white = 0;
		int black = 0;
		String mor = "";
		String lun = "";
		String din = "";
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("일어난 시간 :");
		white = sc1.nextInt();
		sc.nextLine();
		System.out.print("잠들시간 시간 :");
		black = sc1.nextInt();
		sc1.nextLine();
		System.out.println("아침에 할 것 : ");
		mor = sc1.nextLine();
		System.out.println("점심에 할 것 : ");
		lun = sc1.nextLine();
		System.out.println("저녁에 할 것 : ");
		din = sc1.nextLine();
		System.out.printf("오늘 일어난 시간은", white , "이고 잠들 시간은" , black , "입니다"  );
		
		
		//3. 물건가격이 10000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
		//출력형식
		//물건 가격은 10000원입니다
		//지불가격을 입력하세요 : 00
		//거스름돈은 3000원입니다.
		
		
		
		
		
	}

}
