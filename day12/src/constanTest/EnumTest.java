package constanTest;

public class EnumTest { // 객체 ==> 타입.객체명 = n >> 각각이 상수들이다 
	enum Day {
		SUNDAY(false), MONDAY(true), TUESDAY(true), THURSDAY(true),
		FRIDAY(true), SATURDAY(false);

		//()생성자 상수들을 하나의 객체로 바꿈1
	
		   // 필드
	      boolean week;

	      // 생성자
	      Day(boolean week) {
	         this.week = week;
	      }

	      // 메소드
	      boolean weekday() {
	         return this.week;
	      }
	};
	
		
	
	
	
	public static void main(String[] args) {
		Day today = Day.FRIDAY; //sf 스테틱 파이널
		System.out.println("오늘은" + today);
		
		  // switch문을 사용한 열거형 상수 처리
	      String result;
	      switch (today) {
	      case MONDAY:
	         result = "월요일";
	         break;
	      case TUESDAY:
	         result = "화요일";
	         break;
	      case FRIDAY:
	         result = "금요일";
	         break;
	      default:
	         result = "다른 요일";
	         break;
	      }
	      System.out.println("오늘은 " + result + "입니다");

	      Day[] days = Day.values(); // 모든 열거형 값을 배열로 가져오는 메소드
	      System.out.println(days);
	      for (Day day : days) { 
	         System.out.println(day);
	      }

	   }
	}

