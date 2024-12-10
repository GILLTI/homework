package scanner;

import java.util.Scanner;

public class ScannerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//1. 입력 클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
//		//2. 출력 메시지(입력받을 것이 어떤것인지)
//		System.out.println("지금 배우고 있는 프로그램이 무엇인가");
//		//3. 입력메소드 를 String  타입 변수에 저장해야한다 
//		String subject = sc.next() ;
//		//4. 변수 출력
//		System.out.println(subject);
		
		
		//실습
		//이름을 입력하세요 : 000
		//000님 안녕하세요
		//printf 사용하기
		
////1. 변수 만들기 //1. 입력클래스 변수 import : ctrl + shift + o
		Scanner sc = new Scanner(System.in);
////2. 출력 메시지 //2. 출력메시지(입력받을 것이 어떤건지 출력)
		System.out.print("이름을 입력하세요 : ");
////3. 입력메소드 String 변수에 저장 //3. String 변수 = 입력 메소드(.next())
		String name = sc.next();
////4. 변수 출력 //4. printf() 출력
		System.out.printf("%s님 안녕하세요",name);
		
		




		
		
	}

}
