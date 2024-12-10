package oper;

import java.util.Scanner;

public class OperTesk01 {
		public static void main(String[] args) {
			//1 사용자로부터 두개의 숫자를 입력받아 두 숫자의 합과 곱을 각각 출력하기
		
			//1) 입력클래스 import
			//2) 변수 2개 선언 int
			//3) 출력 메소드
			//4) 입력메소드 nextLine()
			//5) 출력 (합, 곱)
			//6) nextLine() : 버퍼 비우기
			
			int num1 = 0, num2 = 0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1번의 값과 2번의 값을 띄어쓰기로 구분해서 입력하시오 :");
			num1 =  sc.nextInt();
			num2 =  sc.nextInt();
			System.out.println("두 숫자의 합은" + (num1 + num2) + "이다");
			System.out.println("두 숫자의 곱은" + (num1 * num2) + "이다");
			sc.nextLine();
			
			//2 1번에서 입력받은 두개의 숫자를 사용하여 평균을 계산하고 소수점 두자리수까지 출력하기
			
			//1) 총합 저장할 변수를 만들기 
			//2) double 변수 만들기 
			//3) 출력
			
//			int sum = num1 + num2;
//			double avg = sum /2; //정수 나누기 정수는 정수
//			System.out.printlf("평균은 %.2f", avg);
			
			System.out.printf("두개의 평균은 %.2f" ,(double)(num1 + num2) / 2 );
			
			//3 두자리수 정수를 입력받고 싶의자리와 일의자리를 출력하기
				
			//입출력 결과
			//두 자리수 정수를 입력하세요 :
			//십의자리는 _입니다. 일의자리는 _입니다
			
			//1) int 타입 변수 3개 생성
			//2) 입력메소드 (nextInt)
			//3) 십의자리 변수 / 10
			//4) 일의자리 변수 % 10
			//5) 출력
			//6) nextLine()
			int num3 = 0 , re1, re2;
			num3 = sc.nextInt();
			re1 = num3 / 10;
			re2 = num3 % 10;
			System.out.println("십의자리는" + re1 + "일의 자리는" + re2);
			sc.nextLine();
			
			//4 코인노래방 프로그램 만들기, 사용자에게 금액을 입력받고 부를 수 있는 곡수와 잔돈 출력하기 
			// 한곡의 가격은 400원 입니다
			
			
			//1) 메세지 출력
			//2) 변수  int 입력 메소드
			//3) 변수 int 곡을 계산할 수 있는 식
			//4) 변수 int 잔돈을 계산할 수 있는 식
			//5) 출력
			
			System.out.println("금액 : ");
			int coin = sc.nextInt();
			int song = coin /400;
			int change = coin % 400;
			System.out.printf("노래할 수 있는 곡은 %d 곡이고 , 잔돈이 %d 반환되었습니다.", song, change);
			
			
			
			
			
		}
}
