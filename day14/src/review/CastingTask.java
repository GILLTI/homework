package review;

public class CastingTask {
	public static void main(String[] args) {
		
		check(new Ballad());
	
//		 check(new Ballad());
//	      check(new Ballad());
//	      check(new Ballad());
//	      Ballad ballad = new Ballad();
//	      ballad = null; //참조제거
//	      System.gc(); //권장하지 않음(개발자가 가비지컬렉션을 명시적으로 요청할 수 있으나 JVM이 반드시 즉시 실행하지는 않음)

	
	}
	
	
	
	static void check(Music music) {
		//업캐스팅된 상태에서 공통 메소드 호출
		music.mode();
		
		if (music instanceof Ballad) {
			((Ballad)music).onlyBalled();//다운캐스팅
		}
	}
	
}
