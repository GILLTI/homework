package oper;

public class BitOper01 {

		public static void main(String[] args) {
			
//			System.out.println(10 & 11); 	//1010 & 1011 = 1010
//			System.out.println(10 | 11); 	//1010 | 1011 = 1011
//			System.out.println(10 ^ 11); 	//1010 ^ 1011 = 0001
//			System.out.println(~10); 	//!1010 = 0101
//		
			
			System.out.println("십진수 :" + 10 + "=> 이진수 : " + Integer.toBinaryString(10));
			System.out.println("십진수 :" + 11 + "=> 이진수 : " + Integer.toBinaryString(11));
			
			//& and 두 비트
			System.out.println("10 & 11의 십진수 :" + (10 &11));
			System.out.println("10 & 11의 이진수 :" + Integer.toBinaryString(10 &11));
			
			//쉬프트연산자
			// <<, >>
			System.out.println(10 << 1); //00010100 << 1
			System.out.println("이진수" + Integer.tobinaryString(10 >>));
			
			System.out.println(10 << 1); //00010100 << 1
			System.out.println("이진수" + Integer.tobinaryString(10 >>));
			
		}
}