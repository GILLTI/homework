package tema;
	import java.util.Scanner;
public class Iteam {

	

			public static void main(String[] args) {
			// 1시간마다 2배씩 증가하는 좀비의 수를 계산하는 문제
			Scanner scan = new Scanner(System.in);// 스캐너
			Iteam s1 = new Iteam();// 클래스 객체

			System.out.print("좀비 수 입력 : ");
			int num = scan.nextInt();// 초기 좀비 수 입력

			if (s1.zombie(num) == 1)// 초기 좀비 수가 1일때
				System.out.println("초기 진압 완료.");
			else// 6시간 후의 좀비 수 출력
				System.out.println("6시간 후의 좀비는 : " + s1.zombie(num) + "마리 입니다");
		}

		int zombie(int zom) { //좀비가 1마리인지 판단
			if (zom == 1)// 좀비가 1마리면 return 1
				return 1;
			return zombie(1, zom);// 1이 아니면 메소드 호출, 오버로딩
		}

		int zombie(int cnt, int zom) { //좀비가 증식하는거, 6시간 후 어떻게 증식하는지 계산
			if (cnt == 6)// 6시간 기준이므로 종료
				return zom * 2;
			else// 6이 아니면 cnt전위증감 후 재귀호출
				return zombie(++cnt, zom) * 2;	
	
}
}