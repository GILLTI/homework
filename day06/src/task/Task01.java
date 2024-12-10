package task;

import java.util.Scanner;

public class Task01 {
			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("갯수를 입력 : ");
//				int num = sc.nextInt();
//				
//				for(int i = 1; i <= num; i++) {
////			         System.out.println("*"); //행
//			    	 
//			       	for(int j = 1; j <= i; j++) {  //열
//			            System.out.print("*");
//			         }
//			         System.out.println();// 줄바꿈해서 3줄
//			         
//			             
//			      }
//					for(int i = 1; i <= num; i++) {
//						for(int j = i; j <= num; j++) {
//							System.out.print("*");
//					}
//					System.out.println("*");
//					}
//			}
//	
				int num1 = sc.nextInt();
				
				for (int i = 1; i <= num1; i++) {
				for (int i = 1; i <= num1-i; i++) {
					System.out.print(" ");
				}
				for (int j = 1; j<= i; j++)	
					System.out.print("*");
				}
				for (int j = 2; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("*");
				
			}
}
