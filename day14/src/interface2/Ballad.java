package interface2;

public class Ballad implements Music{

	@Override	// 오버라이딩 할때 접근제한자의 범위가 자식클래스가 부모 클래스보다 넒을 수 있지만 좁을 수 없다
	
	public void mode() {
		System.out.println("발라드 모드");
		
	}
	void onlyBallad() {
		System.out.println("onlyBallad 실행");
	}
	
}
