package doWhileTest;
// 6번 : 기타 제어문 break
public class BreakTest01 {
			public static void main(String[] args) {
				//1~10까지 5까지만 출력
				for(int i = 0; i <= 10 ; i++) {
						System.out.println(i + 1);
						if(i == 4) { 
							break;
						}
						System.out.println("확인");
				}
					//System.out.println("출력끝");
				
				int num = 1;
				while(num <= 10) {
						if(num >7) {
							break;
						}
						System.out.println(num);
						num++;
				}
				
				
				
				
				
				
				
				
			}
}
