package method;
//5번 : 메소드 사용이유 2
public class MethodBasic02 {
	public static void main(String[] args) {
		//동일한 로직을 구현하기 위해 새롭게 코드를 작성할 필요없이
		//이미 작성된 메소드를 호출하면 된다
		//작성된 코드의 재사용성을 높일 수 있다
		
		System.out.println("직사각형면적" + calculateArea(5, 10)); //int형 
		System.out.println("직사각형면적" + calculateArea(50, 10));
		
	
	}
		static int calculateArea(int width, int height) {
			return width * height;
			}
	
}
