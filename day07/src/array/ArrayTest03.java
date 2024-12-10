package array;
// 3번 : 배열의 저장공간과 값
public class ArrayTest03 {
			public static void main(String[] args) {
				int[] arData = {4, 3, 2, 5};
				//heap 메모리에 4개의 저장공간이 생기고 int arData에 4,3,2,5 의 값이 각각 저장이 된다
				
				//정수형배열 arData stack 메모리영역에 생성(참조변수),
				//heap 메모리 영역에 4칸짜리 4, 3, 2, 5라는 값을 저장한 배열을 생성하고
				//참조값(주소값)을 arData라는 참조 변수에 담는다
				
				
				System.out.println(arData);
				
				System.out.println(arData[0]); //값
				arData[0] += 10; //여기서 atData는 저장공간, 값
				
				
				System.out.println("배열의 길이 : " + arData.length);
				
				double[] arData1 = null;
				arData1 = new double[4];
							//new int[4]; new일때 같은 타입으로 해준다
				System.out.println("배열의 길이 :" + arData1.length);
				
				
				
				
			}
}
