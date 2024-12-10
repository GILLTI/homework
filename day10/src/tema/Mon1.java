package tema;

import java.util.Scanner;

public class Mon1 {
	public static void main(String[] args) {
		// 메소드로 계산기 만들기
		// 사칙연산 실행
		// 조건
		// 1차원 2칸짜리 배열 생성
		// 사용자로부터 입력 받고(int형) 배열에 저장(for문으로 저장)
		// 메소드4개(더하기, 빼기, 곱하기, 나누기)
		// 리턴타입 O, 매개변수 O (매개변수는 배열로 전달)
		// -> 더하기 메소드(for-each문 사용)
		// -> 빼기 메소드(큰값 - 작은값)
		// -> 곱하기 메소드(원하시는 대로)
		// -> 나누기 메소드(실수형으로 형변환. 0번 인덱스/1번 인덱스.
		// 0으론 나눌 수 없음.)

		Scanner scan = new Scanner(System.in);	// 입력 메소드 import
		Mon1 ta = new Mon1();					// 객체를 생성 

		int arr[] = new int[2];					// 1차원 2칸짜리 배열 생성

		for (int i = 0; i < arr.length; i++) {		//배열의 길이만큼 정수를 
		System.out.print("정수를 입력해주세	요 : ");		//입력받을 메세지 출력, 인덱스의 값 출력
			arr[i] = scan.nextInt();				//배열만큼 입력받음
		}

		System.out.println();						//줄 구분

		System.out.println("두 수의 합은 : " + ta.sum(arr));	//합
		System.out.println("두 수의 차는 : " + ta.sub(arr));	//차
		System.out.println("두 수의 곱은 : " + ta.mul(arr));	//곱
		double result = ta.div(arr);						//나눗셈
		if (result != 0)									//if else문울 사용
			System.out.println("두 수의 나누기는 : " + result);	//나눈 값
		else
			System.out.println("0으론 나눌 수 없습니다.");		//0으로 나눌 수 없는 값 분리

		scan.close();
	}														//여기서부턴 main메소드 밖

	int sum(int[] ar) {									//덧셈메소드	
		int result = 0;									//
		for (int data : ar)								//int 변수가 ar 배열의 각 자리에 있는 값을 대입한다
			result += data;
		return result;
	}
	int sub(int[] ar) {									//큰값에서 작은값을 뺄 수 있게
		if (ar[0] > ar[1])
			return ar[0] - ar[1];						//if else문 사용
		else
			return ar[1] - ar[0];
	}

	int mul(int[] ar) {									//곱하기
		return ar[0] * ar[1];
	}

	double div(int[] ar) {								//0으로는 나눌 수 없기에
		if (ar[1] == 0)									//if else문을 사용하여 각각 분리
			return 0;
		else
			return (double) ar[0] / ar[1];
	}
}

