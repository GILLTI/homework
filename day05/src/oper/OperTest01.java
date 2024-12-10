package oper;

import java.util.Scanner;

//2번 : 삼항 연산자

public class OperTest01 {
			public static void main(String[] args) {
				
			//다음 중 음식이 아닌것은
			//1. 피자
			//2. 케이크
			//3. 불고기
			//4. Java
			//삼항 연산자를 사용하여 입력받은 값과 정답 비교하고 정답입니다 or 오답입니다 출력하기
				
			//1) 입력클래스 import
			//2) 변수 int 1개 상수 int 1개 
			//3) 문제 출력하고 입력 메시지 출력
			//4) 변수 nextInt
			//5) 변수 삼항 연산자 결과 대입 true,false
			//6) 츨력
				
			String quizMsg = "다음 중 음식이 아닌것은?\n"
					+"1. 피자\n"
					+"2. 케이크\n"
					+"3. 불고기\n"
					+"4. Java\n"
					+"번호를 입력하시오 : ";
			
			
			int choice = 0;
			final int answer = 4;
			Scanner sc = new Scanner(System.in);
			System.out.println(quizMsg);
			choice = sc.nextInt();
		//	System.out.println(answer == choice ? "정답" : "오답");
			System.out.println(answer == choice ? "정답" : (choice >= 1 && choice < 4) ? "오답" : "잘못입력");
			
			
			//문자열 비교
			String choice2 = "";
			final String answer2 = "java";
			choice2 = sc.nextInt();
			System.out.println(answer2.equals(answer2) ? "정답" : "오답");
			//문자열 비교는 .equals()
			}
}
