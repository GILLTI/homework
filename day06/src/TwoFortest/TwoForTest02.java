package TwoFortest;
//3번 : 2종 for문 별찍기(i와 j의 규정성 확인)
public class TwoForTest02 {
			public static void main(String[] args) {
//		      *
//		      * *
//		      * * * 

				 for(int i = 1; i <= 7; i++) {
//			         System.out.println("*"); //행
			    	 
			       	for(int j = 1; j <= i; j++) {  //열
			            System.out.print("*");
			         }
			         System.out.println();// 줄바꿈해서 3줄
			      }	
				
		      
		      for(int i = 1; i <= 7; i++) { 
//		         System.out.println("*"); //행
		    	 
		       	for(int j = i; j <= 7; j++) {  //열
		            System.out.print("*");
		         }
		         System.out.println();// 줄바꿈해서 3줄
		      }
		      // 첫번째 바깥쪽 반복 i = 1
		      // j = 1 -> .print("*") -> 출력 : *
		      // j = 2 -> .print("*") -> 출력 : **
		      // j = 3 -> .print("*") -> 출력 : ***
		      // 안쪽 반복문 종료 => .println() -> 줄바꿈

		      // 두번째 바깥쪽 반복 i = 2
		      // j = 1 -> .print("*") -> 출력 : *
		      // j = 2 -> .print("*") -> 출력 : **
		      // j = 3 -> .print("*") -> 출력 : ***
		      // 안쪽 반복문 종료 => .println() -> 줄바꿈

		      // 세번째 바깥쪽 반복 i = 3
		      // j = 1 -> .print("*") -> 출력 : *
		      // j = 2 -> .print("*") -> 출력 : **
		      // j = 3 -> .print("*") -> 출력 : ***
		      // 안쪽 반복문 종료 => .println() -> 줄바꿈

		      // j가 1부터 i까지 증가하면서 별의 개수가 행 번호에 따라 달라진다
		   }
		

		   }
		