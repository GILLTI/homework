package task;

import java.util.Scanner;

public class Mo1 {
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

	      for (int i = 0; i < num; i++) {
	         for (int j = 0; j < num-i; j++) {
	            System.out.print(" ");
	         }
	         for (int j = 0; j <= i; j++) {
	            System.out.print("* ");
	         }
	         
	         System.out.println();
	      }
	      for (int i = 0; i <= num; i++) {
	         for (int j = 0; j < i; j++) {
	            System.out.print(" ");
	         }
	         for (int j = 0; j <= num-i; j++) {
	            System.out.print("* ");
	         }
	         
	         System.out.println();
	      }

	      System.out.println();
	   }
	}

//입력을 받기위해 입력클래스 생성
//입력값을 받기위해 변수를 생성
//nextInt 정수 값 받기
//열과 행을 표현하기 위해 반복문의 이중 for문을 사용
//공백과,별을 표현 
//공백은 많은 순에서 적은순으로 가게 한다
//*은 공백 옆에 표시하고 스페이스바를 추가해 옆으로 퍼지게 한다
//상단부와 하단부로 나눈다
//하단부는 상단부와 역순으로 작성한다
//증감연산자 사용, 관계연산자 사용 
