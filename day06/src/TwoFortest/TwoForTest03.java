package TwoFortest;

import java.util.Scanner;

public class TwoForTest03 {
				public static void main(String[] args) {
					
				Scanner sc = new Scanner(System.in);
				System.out.println("*의 갯수를 입력하시오 :");
			
				
				int num = sc.nextInt();
		
					for(int i = 1; i <= num; i++) {
//				         System.out.println("*"); //행
				    	 
				       	for(int j = 1; j <= i; j++) {  //열
				            System.out.print("*");
				         }
				         System.out.println();// 줄바꿈해서 3줄
				      }
				}
	
	
}
