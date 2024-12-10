package oper;

import java.util.Scanner;

//1번 : 삼항연산자


public class OperTask01 {
	public static void main(String[] args) {
		//정수 2개를 입력받아서 큰 수 출력하기(삼항 연산자 이용)
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0 ; 
		String result1 = "";
		
		System.out.print("정수 2개를 입력 : ");
		 num1 = sc.nextInt();
		 num2 = sc.nextInt();
		// result = 조건식 ? 참일 때의 값 : 거짓일 때의 값
		 result1 = num1 > num2 ? "큰 수 : " +num1 : num1 == num2 ? "두수는 같습니다" : "큰 수 : " + num2;
	      System.out.println(result1);

		
	}

}
