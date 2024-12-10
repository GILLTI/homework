package tema;
import java.util.Scanner;

public class Sol2 {

	public static void main(String[] args) {
//		[조건]
//키워드 : ~냥 , ~냠, ~용, ~쪄
//	1. 매개변수 o, 리턴값 o (키워드 포함 여부를 담은 정수형 flag 변수 선언할 것)
//	2. 입력받은 문자열 중에 키워드가  있다면 해당 키워드를 2번 연속 출력하게 문장을 바꿉니다.
//	   그 후 "당신은 귀엽습니다" 문장을 다음 줄에 출력 합니다.
//	3. 만약 키워드가 포함되지 않았다면 "잘하고 있습니다, 앞으로도 그렇게 사용해주세요" 출력
//	4. 키워드가 들어간 문장이 총 3번 이상 입력 되었을때 “그  만!” 
//		문장을 출력시키고 프로그램을 종료시킵니다.
//	5. 메소드 명 : iAmCute

		// String iAmCute(String word)
		// 입력받은 문자열을 문자형 배열로 저장
		// char[] key = new char[word.length()];
		// char 냥 냠 용 쪄
		// boolean flag = true;
		// while(flag)
		// if(word)
		// 키워드 사용 없으면 그렇게 해주세요 리턴 flag = true;
		// 키워드 사용하면 뒤에 마지막 글자 뒤에 붙여주고 사용 횟수 카운트 출력 리턴
		// 키워드 3번 사용하면 그만 리턴 flag = false;

		Scanner scan = new Scanner(System.in); //입력 스캐너 생성
		Sol2 s2 = new Sol2(); //객체 정의

		int count = 0; //내가 입력한 값이 몇인지 카운트 = 초기값은 0으로 지정
		while (true) { //반복하기(boolean값이 false까지, 혹은 break를 만날때까지)
			System.out.print("메세지 입력 : "); //메세지 띄우기
			String msg = scan.next(); //입렵값 받아서 msg에 할당

			if (s2.iAmCute(msg) == 1) { //메서드 호출
				count++; //카운트 증감
				if (count == 4) { //만약 카운트가 4, 즉 4번 연속 똑같은거 입력 했다면
					System.out.println("그  만!!!!"); //고만
					break; //탈출
				}//													  0   1    2   3   4
				//입력한 값+입력한 값의 맨 뒷자리(길이는 0부터 시작 거기서 1을 뺴면 5 '안' '녕' '하' '세' '용') → 길이-1(5-1) = 4(4번째 추출)
				System.out.println(msg + msg.charAt(msg.length() - 1)); 
				System.out.println("당신은 귀엽습니다 >.<"); //?
			} else //아니면
				System.out.println("잘하고 있습니다. 앞으로도 그렇게 사용해주세요"); //념념 굿
		}
	}

	int iAmCute(String m) { //전 귀여워요 메소드에 매개변수 m
		int flag = 0; //조건에 맞추기 위해 정수형 flag 변수 생성
		char keyWord[] = { '냥', '냠', '용', '쪄' }; //문자 배열에 냥, 냠, 용, 쪄 4개의 값 할당
		for (char data : keyWord) //빠른 for문, 각 배열의 값을 순회 하면서 값 비교
			if (data == m.charAt(m.length() - 1)) //만약 문자타입 data 변수가 입력받은(m)값과 같으면 
												//문자형을 문자열로 변환해주고 입력의 길이를 가져오고 마지막 길이 1개 불러오기 
												//(즉 내가 입력한 값이 냥, 냠, 용, 쪄 구분)
					flag = 1; //flag 결과값을 1로 반환
			return flag; //없다면 0으로 반환
	}
}	
	
