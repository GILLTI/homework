package task;

import java.util.Scanner;

//	1
//	121
//	12321
//	1234321
//	123454321



public class Test01 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int num = 0;
				System.out.println("숫자를 입력하시오");
				num = sc.nextInt();
				
				for(int i = 0; i < num ; i++) {
					for(int j = 0; j <= num ; j++) {
						System.out.print("1");
					}
					System.out.println();
				}
				
				
				

					}
				}