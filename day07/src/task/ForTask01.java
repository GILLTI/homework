package task;

public class ForTask01 {
			public static void main(String[] args) {
				

				      //1. 1 ~ 100까지 출력 tab키만큼 간격 띄우고 10마다 줄바꿈
				      // 1   2   3   4   5   6   7   8   9   10
				      //11   12   13..                  20
				      //21   22   ........               30
				      //91   ...                        100
				      
				//1 for문으로 열을 담당하는 정수 i 생성후 10보다 작을때 까지 증감후 반복
				//2 그 안에 행을 담당하는 정수 j 를 생성후 표현		
				//	print에서 계산식과 /t 로 탭키 구현
				// syso로 줄바꿈해주기
				for(int i = 0; i < 10; i++) {
					for( int j = 0; j < 10; j++) {
					System.out.print((i * 10 )+ j + 1 +"\t");
				}
						System.out.println();
				}
					
								
							
//				
//				      //2. A~F출력
				      int a = 'A';
////				      
				//1) for문 사용해서 6번 반복하기
				//2) A는 문자니깐 char사용해서 형변환하기
				//3) 출력
				for(int i = 0; i <6; i++) {
					System.out.println((char) (a + i));
				}
			
				
				
				
				
				
				
//				      //3. aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
//				      int i = 0;
				   //1)  반복문을 사용해서 대문자와소문자 구분해서 출력 
				
				 for (int i = 1; i <= 100; i++) {
				     if (i % 3 == 0 || i % 5 == 0) {//3의 배수와 5의 배수 or연산
				        System.out.print(i + "\t");
				        check++;
				     }
				     if (check == 5) {//줄바꿈
				        System.out.println();
				        check = 0;//초기화
				     }
				  }
				  System.out.println();
				  System.out.println();
				
				
				
				      //4.1) 1부터 100까지 숫자 중 3의 배수 또는 5의 배수만 한 줄에 5개씩 띄어쓰기로 구분되도록 출력
				      //   2) 5의 배수 또는 5의 배수 숫자들의 합을 구하기
				      
				

				      
			
			}
}
