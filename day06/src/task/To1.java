package task;

import java.util.Scanner;

public class To1 {
	public static void main(String[] args) {
	      // 3번 문제
	      //   *
	      //  * *
	      // * * *
	      //  * *
	      //   *
	      Scanner scan = new Scanner(System.in); // 1. 스캐너 생성
	      int num = 0; // 2. 변수

	      System.out.print("숫자 입력 : "); // 3. 입력 받기
	      num = scan.nextInt();

	      for (int i = 0; i < num; i++) {// 입력받은 숫자만큼 반복
	         for (int j = 0; j < num - i; j++) {// 첫 번째 반복일 수 록 공백을 많이 출력해서 피라미드 모양을 만들어 줌
	            System.out.print(" "); // 공백 출력
	         }
	         for (int j = 0; j <= i; j++) {// 반복할 수 록 * 을 많이 출력(마지막에 가장 많은 * 이 출력 됨)
	            System.out.print("* ");// * 출력
	         }

	         System.out.println();// 줄바꿈
	      }

	      for (int i = 1; i < num; i++) {// 위 피라미드의 리버스 버전, 위 피라미드를 뒤집어서 출력하고 첫 번째 줄을 제외하고 출려하면 다이아몬드 모양이 만들어짐
	         for (int j = 0; j <= i; j++) {
	            System.out.print(" ");
	         }
	         for (int j = 0; j <= num - i - 1; j++) {
	            System.out.print("* ");
	         }

	         System.out.println();
	      }

	      System.out.println();
	   }
}
