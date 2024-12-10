package staticTest;

public class StaticBlock {
	
	
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
	}
	static {System.out.println("클래스 로그 1번 실행");	} //정적블록 //클래스 로드시에 
															// 제일 먼저1번만 실행


}
