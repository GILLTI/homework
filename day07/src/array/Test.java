package array;

public class Test {
		public static void main(String[] args) {
			
		
	int num[] = new int[5];// 5칸 배열 생성

    for (int i = 0; i < num.length; i++) {
       num[i] = num.length - i;// 5부터 1까지 대입
    }
    for (int i = 5; i > 0; i--) {
       num[num.length - i] = i;// 5부터 1     까지 대입
    }
    for (int i = 0; i < num.length; i++) {
       System.out.println(num[i]);// 배열 전체 출력
    }
    }
}
