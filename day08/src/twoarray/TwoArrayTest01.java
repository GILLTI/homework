package twoarray;
//1번 : 2차원배열
//	행과 열로 구성된 데이터를 저장하는 배열의 형태

public class TwoArrayTest01 {
				public static void main(String[] args) {
					int[][] ar1;				//2차원 배열 선언
						ar1 = new int[3][2];	//3행 2열 크기의 배열생성
						
						System.out.println(ar1);		//3행 2열의 참조값 =[[I@65ae6ba4
						//[[0, 0], [0,0], [0,0]
						System.out.println(ar1[0]);		//0행의 참조값 -> 1차원 배열의 참조값 = [I@7960847b
						System.out.println(ar1[0][0]);	//0행 0열의 참조값 = 0
					
						
						int[] ar2 = new int [3];
						System.out.println(ar2);		//1차원 배열의 첫번째 값[I@6a6824be
						//[0,0,0]
						
				}
}
