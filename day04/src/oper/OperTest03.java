package oper;

import java.util.Scanner;

//11번 : 관계연산자와 논리 연산자


public class OperTest03 {
		public static void main(String[] args) {
//			int num1 = 0;
//			int num2 = 0;
//			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("두 수를 입력하시오 : ");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			sc.nextLine();
//			
			int num1 = 10;
			int num2 = 15;
			
			System.out.println("num1 > num2 : num1이 num2보다 크니?" + (num1 > num2));
			System.out.println("num1 < num2 : num1이 num2보다 작니?" + (num1 < num2));
			System.out.println("num1 >= num2 : num1이 num2보다 같니?" + (num1 >= num2));
			System.out.println("num1 <= num2 : num1이 num2보다 같니?" + (num1 <= num2));
			System.out.println("num1 == num2 : num1이 num2보다 같니?" + (num1 == num2));
			System.out.println("num1 != num2 : num1이 num2보다 같지않니?" + (num1 != num2));

			
			System.out.println("-----논리연산자-----");
// 			and 둘다 참이면 참 하나라도 거짓이면 거짓
			System.out.println(true&&true);
			System.out.println(true&&false);
			System.out.println(false&&true);
			System.out.println(false&&false);
//			or 둘중에 하나라도 참이면 참
			System.out.println(true||true);
			System.out.println(true||false);
			System.out.println(false||true);
			System.out.println(false||false);
//			not 반대			
			System.out.println(!true);
			System.out.println(!false);
			
			
		}
	}
