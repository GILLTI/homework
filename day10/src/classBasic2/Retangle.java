package classBasic2;
//4번 : 클래스의 특징( 연관성 있는 데이터와 기능을 한 곳에 통합)
public class Retangle {

		//직사각형 정보와 관련된 기능
		
		int width; //너비
		int height; //높이
		
		//직사각형의 높이와 너비가 각각 다를 수 있다
		
		//넢이를 계산하는 메소드
		//메소드
		int getArea() {
			return width * height;
			
		}
		
		
		//들레를 계산하는 메소드
		int getPerimeter() {
			return (width + height) * 2;
			
	
}
}
