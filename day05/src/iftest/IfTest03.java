package iftest;
//7번 : if~else if~else문
public class IfTest03 {
			public static void main(String[] args) {
				
				int num1 = 10, num2 = 20;
				
				System.out.println("1");
				if(num1 > num2) {
					System.out.println("2");
				}
				else if(num1 == num2){
					System.out.println("3");
				}
				else {
					System.out.println("4");
				}
				System.out.println("5");
			}
}
