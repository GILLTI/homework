package array;
//2번 : 배열 index
public class ArrayTest02 {
			public static void main(String[] args) {
				//어떤값을 넣을 지 알 때
				int[]	ar1 = {1, 2, 3, 4, 5}; // teap메모리
				System.out.println(ar1);//stack메모리 ar1= 참조변수, 참조값을 가진다
				System.out.println(ar1[0]);
				//Heap메모리에 0번째 인덱스(저장공간)번호에 저장된 출력
				//ar1 = Heap메모리에 저장된 배열의 시작주소 => 참조값
				
				//몇칸 만들지 알 때
				int[] ar2 = new int[3];
				System.out.println(ar2);
				//ar2는 Heap메모리에 저장된 시작주소값인 참조값을 담고있음
				System.out.println(ar2[0]);
				//ar[0] 해당 배열의 첫번째 칸을 의미하고
				//변수처럼 사용할 수 있다
				//값을 모르기 때문에 해당 배열의 자료형의 초기값으로 자동 적용
				
				int[] ar3 = null; //주소값을 모른다, 없다
				ar3 = new int[] {1, 2, 3};
				//new : heap 메모리의 해당 칸을 만들고 시작 주소값을 가져온다
				
				System.out.println(ar3);
				ar3[0] = 1;
				System.out.println(ar3[0]);
				
			}
	
	
}
