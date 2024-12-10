package classBasic;
//1-1번 : 클래스 - 사용자 정의 타입이다(자료형)
public class Student {
		//필드(속성)
		int math;		//int math = 100; 초기값을 넣을 수 있다. 
						//객체별로 다른 값을 가질 것이기 때문에 기본값을 설정하지 않는 것이 좋다
						//ex) a와 b 는 점수가 다르기 때문에 
		int eng;
		int kor;		//메소드 밖에 있어서 필드라 부른다
						//안에있으면 변수
		double avg;
		String name;
	//메소드(기능)
	//1-3 번: 
		int getTotal() { //매개변수 x , 메소드
			return math + eng + kor;
			
		}
		
		
		
}
