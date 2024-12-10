package classBasic;
//1-2 번 : Student 클래스의 객체를 만들 클래스 
public class StudentMain {
		public static void main(String[] args) {
			
			
			Student st1 = new Student();	//Stdent클래스에 2개의 객체를 만들었다 == 선언한 각각의 저장공간이 다르다
			Student st2 = new Student();// 각각의 저장공간에 다른 정보를 저장할 수 있다.
			
			System.out.println(st1);
			
			 st1.name = "짱짱짱";
			 st1.kor = 100;
			
			 st2.name = "승현";
//			 st2.avg = (double) (st2.kor + st2.eng + st2.math) / 3;
//		      System.out.println(st1.name);
//		      System.out.println(st2.name);
//		      System.out.printf("%s의 평균 점수는 %.2f점 입니다", st2.name, st2.avg);

			//객체.필드 = "이름"
			//객체마다 고유한 값을 저장할 수 있다
			
			  //1-4번 : 연관성있는 저장공간과 기능을 한곳에 모아 관리할 수 있는 것
		      System.out.println(st2.getTotal());
		      
		      st1.kor = 50;
		      st1.eng = 30;
		      st1.math = 100;
		      System.out.println(st1.getTotal());

			 
			 
			
		}
	
	
	
	
}
